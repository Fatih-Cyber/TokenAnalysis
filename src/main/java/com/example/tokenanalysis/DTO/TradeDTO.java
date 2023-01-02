package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.entity.CurrencyRate;
import com.example.tokenanalysis.entity.Trader;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
@Getter
@Setter
@NoArgsConstructor
public class TradeDTO {
    private TraderDTO seller;
    private TraderDTO buyer;
    private BigDecimal quantity;
    private CurrencyRateDTO currencyRate;
    private String sellerAccountNo;
    private String buyerAccountNo;
}
