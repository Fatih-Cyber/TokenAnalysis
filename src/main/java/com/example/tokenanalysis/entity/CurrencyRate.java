package com.example.tokenanalysis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "currency_rates")
public class CurrencyRate extends BaseEntity{

    @OneToOne
    private Currency currency;
    @OneToOne
    private Currency baseCurrency;
    float rate;
    private LocalDateTime timeStamp;
}
