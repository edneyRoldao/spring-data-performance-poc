package com.edntisolutions.springdataperformance.repository;

import com.edntisolutions.springdataperformance.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
