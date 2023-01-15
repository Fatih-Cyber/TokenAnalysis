package com.example.tokenanalysis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
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
