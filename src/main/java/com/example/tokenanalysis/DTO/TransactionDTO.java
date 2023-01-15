package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class
TransactionDTO{
    private String txHash;
    private String blockNumber;
    private LocalDateTime DateTime;
    private String fromAccount;
    private String toAccount;
    private String Quantity;
    private String Method;
}
