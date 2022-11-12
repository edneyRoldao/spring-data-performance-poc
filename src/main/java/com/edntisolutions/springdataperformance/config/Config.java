package com.edntisolutions.springdataperformance.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@Configuration
@EntityScan({"com.edntisolutions.springdataperformance.model"})
@EnableJpaRepositories({"com.edntisolutions.springdataperformance.repository"})
public class Config {

}
