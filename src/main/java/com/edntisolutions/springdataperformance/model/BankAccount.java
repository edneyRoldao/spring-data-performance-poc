package com.edntisolutions.springdataperformance.model;

import com.edntisolutions.springdataperformance.enums.AccountType;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bank_account")
public class BankAccount implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float balance;

    private String clientName;

    private String clientDocument;

    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private AccountType accountType;


    public static List<BankAccount> buildRandom(Long totalItems) {
        Random random = new Random();
        List<BankAccount> items = new ArrayList<>();
        int accountTypeIndex = 0;
        AccountType[] accounts = AccountType.values();

        for (int i = 0; i < totalItems; i++) {
            if (accountTypeIndex > accounts.length - 1)
                accountTypeIndex = 0;

            int minusDays = random.nextInt(600) + 1;
            LocalDateTime createdAt = LocalDateTime.now().minusDays(minusDays);

            var type = accounts[accountTypeIndex++];

            var obj = BankAccount
                    .builder()
                    .accountType(type)
                    .createdAt(createdAt)
                    .balance(random.nextFloat())
                    .clientName(UUID.randomUUID().toString())
                    .clientDocument(UUID.randomUUID().toString())
                    .build();

            items.add(obj);
        }

        return items;
    }

}
