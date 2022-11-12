package com.edntisolutions.springdataperformance.controller;

import com.edntisolutions.springdataperformance.enums.EventStatus;
import com.edntisolutions.springdataperformance.model.Event;
import com.edntisolutions.springdataperformance.repository.BankAccountRepository;
import com.edntisolutions.springdataperformance.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BankController {

    private final EventRepository eventRepository;
    private final BankAccountRepository repository;

    @GetMapping("total-accounts")
    public Long totalAccount() {
        return repository.totalAccountCreated();
    }

    @GetMapping("cancel")
    public String cancelProcess() {
        List<Event> events = eventRepository.findAll();
        Event event = events.get(0);
        event.setStatus(EventStatus.CANCELLED);
        eventRepository.save(event);

        return "processo cancelado";
    }

}
