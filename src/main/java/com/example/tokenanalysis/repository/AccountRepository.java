package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.DTO.AccountDTO;
import com.example.tokenanalysis.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findAccountByAccountNo(String accountNumber);
    List<Account> findAll();


}
