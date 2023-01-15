package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.entity.Transaction;
import jakarta.persistence.OneToMany;

import java.util.List;

public class AccountDTO {
    String accountNo;
    private List<TransactionDTO> transferOut;
    private List<TransactionDTO> transferIn;
}
