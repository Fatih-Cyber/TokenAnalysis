package com.example.tokenanalysis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class CurrencyRate extends BaseEntity{

    @ManyToOne
    private Currency currency;
    @ManyToOne
    private Currency baseCurrency;
    private BigDecimal rate;
    private LocalDateTime timeStamp;
    private String code;
}
