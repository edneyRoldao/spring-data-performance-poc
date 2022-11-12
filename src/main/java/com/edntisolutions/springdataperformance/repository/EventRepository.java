package com.edntisolutions.springdataperformance.repository;

import com.edntisolutions.springdataperformance.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
