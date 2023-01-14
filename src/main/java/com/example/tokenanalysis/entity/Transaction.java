package com.example.tokenanalysis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transactions")
public class Transaction extends BaseEntity{
    private String txHash;
    private String blockNumber;
    private LocalDateTime DateTime;
    @ManyToOne
    private Account fromAccount;
    private String quantity;
    @ManyToOne
    private Account toAccount;
    private String method;
}
