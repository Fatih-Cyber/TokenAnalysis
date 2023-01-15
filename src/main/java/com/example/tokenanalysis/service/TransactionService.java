package com.example.tokenanalysis.service;

import com.example.tokenanalysis.entity.Account;
import com.example.tokenanalysis.entity.Transaction;

public interface TransactionService {
    void save(Transaction transaction);
    Transaction findByTxHash(String txHash);
}
