package com.remnant.lms.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.remnant.thirdparty.valr.ValrSigner;

@Component
public class HttpTools {

	private static final String API_KEY = "a30355cade678ab724e713d72abeda2ad3f94396567c515096697b9b8c3544aa";
	private static final String API_SECRET = "61060e9c635196d6c4719ae675263743a18d1a3691f2d10ba480c9b9b07b94c8";
	
	private static final String VALR_URL = "https://api.valr.com/v1/";

	@Autowired
	private RestTemplate restTemplate;
	
	public static HttpHeaders createHeader(String signature, String currTime, String subAccountId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("X-VALR-API-KEY", API_KEY);
		headers.set("X-VALR-SIGNATURE", signature);
		headers.set("X-VALR-TIMESTAMP", currTime);
		headers.set("X-VALR-SUB-ACCOUNT-ID", subAccountId);
		return headers;
	}

	public HttpEntity<String> getHeaders(String signature, String currTime, String subAccountId, String body) {
		HttpHeaders headers = createHeader(signature, currTime, subAccountId);
		HttpEntity<String> entity = new HttpEntity<>(body, headers);
		return entity;
	}

	public HttpEntity<String> getHttpHeader(HttpMethod method, String path, String subAccountId, String body) {
		String currTime = String.valueOf(System.currentTimeMillis());
		String signature = ValrSigner.signRequest(API_SECRET, currTime, method.name(), "/v1/" + path, body,
				subAccountId);
		HttpEntity<String> entity = getHeaders(signature, currTime, subAccountId, body);
		return entity;
	}

	public ResponseEntity<String> exchange(HttpMethod method, String path, String subAccountId, String body) {
		HttpEntity<String> entity = getHttpHeader(method, path, subAccountId, body);
		ResponseEntity<String> response = restTemplate.exchange(VALR_URL + path, method, entity, String.class);
		return response;
	}
}
