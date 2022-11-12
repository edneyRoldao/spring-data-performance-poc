package com.edntisolutions.springdataperformance.tests;

import com.edntisolutions.springdataperformance.service.EventService;
import com.edntisolutions.springdataperformance.service.SaveBankAccountPerformanceTestV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class InsertInBatchPerformanceTest implements CommandLineRunner {

    @Autowired
    private EventService eventService;

    @Autowired
    private SaveBankAccountPerformanceTestV1 test;

    @Override
    public void run(String... args) throws Exception {
//        Long eventId = eventService.createEvent();
//        test.firstTest(eventId, 100_000);
    }

}
