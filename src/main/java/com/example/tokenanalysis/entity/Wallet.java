package com.example.tokenanalysis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Wallet extends BaseEntity{
    @ManyToOne
    private Trader trader;

    private String accountNo;

    private BigDecimal quantity;
    @ManyToOne
    private Currency currency;
    @ManyToOne
    private Currency baseCurrency;



}
