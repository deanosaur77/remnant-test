package com.remnant.lms.calculators;

import org.springframework.stereotype.Service;

import com.remnant.lms.dto.RemnantQuote;
import com.remnant.lms.dto.RemnantRequest;
import com.remnant.lms.dto.ScheduleDetail;
import com.remnant.lms.dto.valr.ValrMarketSummary;


@Service
public class QuoteCalculator {

	private static final double FACILITY_FEE = 100.0;
	private static final double RETURN_APR = 18;


	public static RemnantQuote calculateQuote(RemnantRequest request, ValrMarketSummary marketSummary) {
		// Add principal to request
		// Server side (decimals)
		double principal = request.getApplicationDetails().getBtcCollateral(); // LoanPrincipal/marketprice
		double monthTerm = Double.parseDouble(request.getApplicationDetails().getTerm());

		RemnantQuote quote = new RemnantQuote();
		double baseRepaymentAmount, interestDue;
		baseRepaymentAmount = (principal / monthTerm);

		quote.setBaseRepaymentAmount(baseRepaymentAmount);
		for (int month = 1; month <= monthTerm; month++) {
			interestDue = (principal - (baseRepaymentAmount * (month - 1))) * ((RETURN_APR / 100) / 12);
			ScheduleDetail schedule = new ScheduleDetail();
			
			schedule.setMonth(month);
			schedule.setRepaymentAmount(baseRepaymentAmount + interestDue + FACILITY_FEE);
		
			quote.getScheduleDetails().add(schedule);
		}
		return quote;
	}
}
