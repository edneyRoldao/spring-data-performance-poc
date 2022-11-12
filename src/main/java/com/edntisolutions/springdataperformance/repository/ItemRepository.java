package com.edntisolutions.springdataperformance.repository;

import com.edntisolutions.springdataperformance.model.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
