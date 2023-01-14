package com.example.tokenanalysis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Trade extends BaseEntity{
    @ManyToOne
    private Trader seller;
    @ManyToOne
    private Trader buyer;

    private BigDecimal quantity;
    @ManyToOne
    private CurrencyRate currencyRate;
    private String sellerAccountNo;
    private String buyerAccountNo;

    // csv to neo4J
    // etherjs
}
