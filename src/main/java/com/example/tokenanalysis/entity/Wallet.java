package com.example.tokenanalysis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Wallet extends BaseEntity{
    @ManyToOne
    private Trader trader;
    @OneToOne
    private Currency currency;
    String accountNo;

    float quantity;
    @OneToOne
    private Currency baseCurrency;



}
