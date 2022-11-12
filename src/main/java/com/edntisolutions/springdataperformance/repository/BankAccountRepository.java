package com.edntisolutions.springdataperformance.repository;

import com.edntisolutions.springdataperformance.model.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

    @Query("select count(ba.id) from BankAccount ba")
    Long totalAccountCreated();

}
