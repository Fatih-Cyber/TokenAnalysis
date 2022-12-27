package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.entity.Currency;
import com.example.tokenanalysis.entity.Trader;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletDTO {
    private Trader trader;
    private Currency currency;
    String accountNo;
    float quantity;
    boolean isActive;
    private Currency baseCurrency;
}
