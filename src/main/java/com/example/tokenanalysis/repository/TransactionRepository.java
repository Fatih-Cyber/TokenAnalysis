package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Long> {
    Transaction findTransactionByTxHash(String txHash);
}
