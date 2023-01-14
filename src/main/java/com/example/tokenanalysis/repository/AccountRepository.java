package com.example.tokenanalysis.repository;

public interface AccountRepository extents JpaRepository<Account,Long>{
        List<Account> findAll();
        Account findByAccountNo(String accountNo);
        }
