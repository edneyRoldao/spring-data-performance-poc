package com.edntisolutions.springdataperformance.service;

import com.edntisolutions.springdataperformance.model.BankAccount;
import com.edntisolutions.springdataperformance.repository.BankAccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class BankAccountService {

    private final EventService eventService;
    private final BankAccountRepository repository;

    @Async
    @Transactional
    public void saveAccountsInBatch(List<BankAccount> accounts, Long eventId) {
        if (eventService.isEventCancelled(eventId))
            return;

        log.warn("### more accounts");
        repository.saveAll(accounts);
        log.warn("process finished");
    }

}
