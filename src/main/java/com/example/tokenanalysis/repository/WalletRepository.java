package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Long> {
    Wallet findWalletByAccountNo(String accountNo);
}
