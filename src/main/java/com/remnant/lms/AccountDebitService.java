package com.remnant.lms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.remnant.lms.db.entity.Account;
import com.remnant.lms.db.entity.Schedule;
import com.remnant.lms.db.repository.AccountRepository;
import com.remnant.lms.db.repository.ScheduleRepository;

@Service
public class AccountDebitService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private ScheduleRepository scheduleRepository;
    
    public void debitAccounts() {
        Iterable<Account> accounts = accountRepository.findAll();

        
        for (Account account : accounts) {
            double debitAmount = calculateDebitAmount(account);
            double newBalance = account.getBalance() - debitAmount;
            account.setBalance(newBalance);
            System.out.print("\nDebiting "+ account.toString());
            accountRepository.save(account);
        }
    }

    private double calculateDebitAmount(Account account) {
    	Iterable<Schedule> entities = scheduleRepository.findAll();
    	// Implement your logic to calculate the debit amount here
        // You might use some business rules or fixed amounts for debiting
        return 0.0; // Replace with the actual calculation
    }
}
