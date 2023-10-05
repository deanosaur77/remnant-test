package com.remnant.lms.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.remnant.lms.calculators.QuoteCalculator;
import com.remnant.lms.db.entity.Address;
import com.remnant.lms.db.entity.Application;
import com.remnant.lms.db.entity.Client;
import com.remnant.lms.db.entity.Schedule;
import com.remnant.lms.db.entity.ScheduleItem;
import com.remnant.lms.db.repository.AddressRepository;
import com.remnant.lms.db.repository.ClientRepository;
import com.remnant.lms.db.repository.ScheduleRepository;
import com.remnant.lms.dto.RemnantQuote;
import com.remnant.lms.dto.RemnantRequest;
import com.remnant.lms.dto.RemnantResponse;
import com.remnant.lms.dto.ScheduleDetail;
import com.remnant.lms.dto.valr.Balance;
import com.remnant.lms.dto.valr.ValrAccountTransfer;
import com.remnant.lms.dto.valr.ValrBalance;
import com.remnant.lms.dto.valr.ValrMarketSummary;
import com.remnant.lms.mapper.LmsMapper;
import com.remnant.lms.tools.HttpTools;

@RestController
@RequestMapping("remnantlms")
public class LmsController {

	private static final String ZAR = "ZAR";
	private static final String PRIMARY_ACCOUNT_ID = "0";
	private static final String WALLET_CRYPTO = "wallet/crypto/";

	private static final String VALR_URL_PUBLIC = "https://api.valr.com/v1/public/";

	private static final String ADD_SUB_ACCOUNT = "account/subaccount";

	private static final String GET_SUB_ACCOUNTS = "account/subaccounts";

	private static final String GET_BALANCES = "account/balances/all?excludeZeroBalances=true";

	private static final String GET_BTC_ADDRESS = "/deposit/address";

	private static final String POST_TRANSFER = "account/subaccounts/transfer";

	private static final String GET_DEPOSIT_HISTORY = "/deposit/history?skip=0&limit=10";

	private static final String GET_WITHDRAW_HISTORY = "/withdraw/history?skip=0&limit=10";

	private static final String GET_TRANSACTION_HISTORY = "account/transactionhistory?skip=0&limit=10&transactionTypes=BLOCKCHAIN_RECEIVE,OFF_CHAIN_BLOCKCHAIN_DEPOSIT";

	private static final String BTC_CURRENCY_CODE = "BTC";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private HttpTools httpTools;


	@Autowired
	private ClientRepository clientRepo;

	@Autowired
	private AddressRepository addressRepo;

	@Autowired
	private LmsMapper mapper;

	@Autowired
	private ScheduleRepository scheduleRepository;

	@PostMapping(value = "addsubaccount")
	public RemnantResponse addSubAccount(@RequestBody RemnantRequest request)
			throws JsonMappingException, JsonProcessingException {

		System.out.println("Email: " + request.getClientDetails().getEmail());

		Client client = clientRepo.findByEmail(request.getClientDetails().getEmail()).orElseThrow();
		String label = "{\"label\": \"" + client.getIdNumber() + "\"}";

		ResponseEntity<String> response = httpTools.exchange(HttpMethod.POST, ADD_SUB_ACCOUNT, "", label);
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> map = objectMapper.readValue(response.getBody(), new TypeReference<Map<String, String>>() {
		});

		String subAccountId = map.get("id");
		String btcAddress = getBTCAddress(subAccountId);

		client.setSubAccountId(subAccountId);
		client.setBtcAddress(btcAddress);
		clientRepo.save(client);

		RemnantResponse remnantResponse = new RemnantResponse();
		remnantResponse.setMessage("Subaccount Added");
		remnantResponse.setBtcAddress(btcAddress);
		remnantResponse.setSubAccountId(subAccountId);

		return remnantResponse;
	}

	@PostMapping(value = "getbalances")
	public String getBalances() {
		ResponseEntity<String> response = httpTools.exchange(HttpMethod.GET, GET_BALANCES, "", "");
		return response.getBody();
	}

	@PostMapping(value = "getsubaccounts")
	public List<Map<String, String>> getSubAccounts() throws JsonMappingException, JsonProcessingException {
		ResponseEntity<String> response = httpTools.exchange(HttpMethod.GET, GET_SUB_ACCOUNTS, "", "");
		ObjectMapper objectMapper = new ObjectMapper();
		return objectMapper.readValue(response.getBody(), new TypeReference<List<Map<String, String>>>() {
		});
	}

	private void grabAndDisperse(Balance balance, String subAccountId)
			throws JsonProcessingException, InterruptedException {
		if (Double.valueOf(balance.getAvailable()) > 0) {
			ObjectMapper mapper = new ObjectMapper();

			String zarAmount = "1.00";

			ValrAccountTransfer tx = new ValrAccountTransfer();
			tx.setFromId(subAccountId);
			tx.setToId(PRIMARY_ACCOUNT_ID);
			tx.setCurrencyCode(balance.getCurrency());
			tx.setAmount(balance.getAvailable());
			httpTools.exchange(HttpMethod.POST, POST_TRANSFER, "", mapper.writeValueAsString(tx));

			Thread.sleep(5000);

			tx.setFromId(PRIMARY_ACCOUNT_ID);
			tx.setToId(subAccountId);
			tx.setCurrencyCode(ZAR);
			tx.setAmount(zarAmount);
			httpTools.exchange(HttpMethod.POST, POST_TRANSFER, "", mapper.writeValueAsString(tx));
		}
	}

	@GetMapping(value = "marketsummary")
	public ValrMarketSummary getMarketSummary() {
		HttpEntity<String> entity = httpTools.getHeaders("", "", "", "");

		ResponseEntity<ValrMarketSummary> response = restTemplate.exchange(VALR_URL_PUBLIC + "BTCZAR/marketsummary",
				HttpMethod.GET, entity, ValrMarketSummary.class);

		return response.getBody();
	}

	public String getBTCAddress(String subAccountId) throws JsonMappingException, JsonProcessingException {
		ResponseEntity<String> response = httpTools.exchange(HttpMethod.GET,
				WALLET_CRYPTO + BTC_CURRENCY_CODE + GET_BTC_ADDRESS, subAccountId, "");
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> map = objectMapper.readValue(response.getBody(), new TypeReference<Map<String, String>>() {
		});
		return map.get("address");
	}

	@PostMapping(value = "getquote", produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
	public RemnantQuote getQuote(@RequestBody RemnantRequest request)
			throws JsonMappingException, JsonProcessingException {
		ValrMarketSummary summary = getMarketSummary();
		createApplication(request);
		RemnantQuote quote = QuoteCalculator.calculateQuote(request, summary);
		Schedule scheduleEntity = new Schedule();

		// TODO: Create account on acceptance.

//		Account account = new Account();
//		account.setInitialAmount(quote.getScheduleDetails());
//		scheduleEntity.setAccount(client);

		for (ScheduleDetail schedule : quote.getScheduleDetails()) {
			ScheduleItem scheduleItem = mapper.scheduleDetailToScheduleItem(schedule);
			scheduleEntity.getSchedule().add(scheduleItem);
		}
		scheduleRepository.save(scheduleEntity);
		quote.setBtcAddress(getBTCAddress(""));
		return quote;
	}

	private void createApplication(RemnantRequest request) {
		Client client = clientRepo.findByEmail(request.getClientDetails().getEmail())
				.orElse(mapper.clientDetailstToClient(request.getClientDetails()));

		addAddress(request, client);

		Application application = mapper.applicationDetailsToApplication(request.getApplicationDetails());
		application.setClient(client);
		client.getApplications().add(application);

		//System.out.println(client.toString());
		System.out.println(client.getEmail());

		clientRepo.save(client);
	}

	private void addAddress(RemnantRequest request, Client client) {
		addressRepo.findByStreet(request.getAddressDetails().getStreet()).ifPresentOrElse(
				address -> System.out.println("Address already exists. Not updating." + address.getStreet()), () -> {
					Address address = mapper.addressDetailsToAddress(request.getAddressDetails());
					address.setClient(client);
					client.getAddresses().add(address);
				});
	}

	@Scheduled(fixedRate = 120000)
	public void checkDeposits() throws JsonMappingException, JsonProcessingException {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			ResponseEntity<String> response = httpTools.exchange(HttpMethod.GET, GET_BALANCES, "", "");
			List<ValrBalance> accountBalances = objectMapper.readValue(response.getBody(),
					new TypeReference<List<ValrBalance>>() {
					});

			for (ValrBalance accountBalance : accountBalances) {
				String subId = accountBalance.getAccount().getId();

				if (subId.equals("0"))
					continue;

				for (Balance balance : accountBalance.getBalances()) {
					if (balance.getCurrency().equals(BTC_CURRENCY_CODE)) {
						System.out.println();
						System.out.println(response);
						System.out.println("GRABBING AND DISPERSING...");
						grabAndDisperse(balance, subId);
						System.out.println("GRABBING AND DISPERSING Complete.");
						Thread.sleep(5000);
					}
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(-1);
		}
	}

}
