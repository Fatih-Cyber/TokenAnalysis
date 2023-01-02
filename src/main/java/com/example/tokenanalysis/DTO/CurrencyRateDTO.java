package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.entity.Currency;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
public class CurrencyRateDTO {

    private CurrencyDTO currency;

    private CurrencyDTO baseCurrency;
    float rate;
    private LocalDateTime timeStamp;
}
