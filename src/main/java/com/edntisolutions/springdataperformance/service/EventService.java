package com.edntisolutions.springdataperformance.service;

import com.edntisolutions.springdataperformance.enums.EventStatus;
import com.edntisolutions.springdataperformance.model.Event;
import com.edntisolutions.springdataperformance.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class EventService {

    private final EventRepository eventRepository;

    public Long createEvent() {
        var event = new Event(LocalDateTime.now(), EventStatus.IN_PROGRESS);
        Event eventSaved = eventRepository.save(event);
        return eventSaved.getId();
    }

    public boolean isEventCancelled(Long eventId) {
        Event event = eventRepository.getReferenceById(eventId);
        return EventStatus.CANCELLED == event.getStatus();
    }

}
