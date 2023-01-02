package com.example.tokenanalysis.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CurrencyDTO {

    String code;
    String name;
    private boolean isActive;
    private boolean isBaseCurrency;
}
