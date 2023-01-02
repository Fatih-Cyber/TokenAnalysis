package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.entity.Currency;
import com.example.tokenanalysis.entity.Trader;
import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class WalletDTO {
    private TraderDTO trader;
    private CurrencyDTO currency;
    String accountNo;
    float quantity;
    boolean isActive;
    private CurrencyDTO baseCurrency;
}
