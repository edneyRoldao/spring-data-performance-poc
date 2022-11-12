package com.edntisolutions.springdataperformance.service;

import com.edntisolutions.springdataperformance.model.BankAccount;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SaveBankAccountPerformanceTestV1 {

    private final BankAccountService service;

    public void firstTest(Long eventId) {
        LocalDateTime init = LocalDateTime.now();

        for (int i = 0; i < 100_000; i++) {
            List<BankAccount> accounts = BankAccount.buildRandom(100L);
            service.saveAccountsInBatch(accounts, eventId);
        }

        LocalDateTime end = LocalDateTime.now();
        long minutes = ChronoUnit.MINUTES.between(init, end);
        System.out.printf("total minutes passed: %s", minutes);
    }

}
