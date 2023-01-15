package com.example.tokenanalysis.service;

import com.example.tokenanalysis.DTO.AccountDTO;
import com.example.tokenanalysis.entity.Account;

public interface AccountService {
    void save(Account account);
    Account findByAccountNo(String accountNo);
}
