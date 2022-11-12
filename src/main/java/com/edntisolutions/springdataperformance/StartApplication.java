package com.edntisolutions.springdataperformance;

import com.edntisolutions.springdataperformance.service.EventService;
import com.edntisolutions.springdataperformance.service.SaveBankAccountPerformanceTestV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartApplication implements CommandLineRunner {

	@Autowired
	private EventService eventService;

	@Autowired
	private SaveBankAccountPerformanceTestV1 test;

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Long eventId = eventService.createEvent();
		test.firstTest(eventId);
	}

}
