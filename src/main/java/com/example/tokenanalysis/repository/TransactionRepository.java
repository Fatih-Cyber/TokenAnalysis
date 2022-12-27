package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.entity.Transactions;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transactions,Long> {
}
