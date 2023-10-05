package com.remnant.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	@Autowired
    private final AccountDebitService accountDebitService;

    public ScheduledTasks(AccountDebitService accountDebitService) {
        this.accountDebitService = accountDebitService;
    }

    @Scheduled(cron = "0 0 0 15 * ?") // Run at midnight on the 15th of every month
    public void performDebit() {
        accountDebitService.debitAccounts();
    }
}
