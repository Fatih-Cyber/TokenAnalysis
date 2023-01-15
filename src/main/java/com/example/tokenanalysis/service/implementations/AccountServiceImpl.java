package com.example.tokenanalysis.service.implementations;

import com.example.tokenanalysis.DTO.AccountDTO;
import com.example.tokenanalysis.entity.Account;
import com.example.tokenanalysis.mapper.AccountMapper;
import com.example.tokenanalysis.repository.AccountRepository;
import com.example.tokenanalysis.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    private final AccountMapper accountMapper;

    public AccountServiceImpl(AccountRepository accountRepository, AccountMapper accountMapper) {
        this.accountRepository = accountRepository;
        this.accountMapper = accountMapper;
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }
    public Account findByAccountNo(String accountNo){
        return accountRepository.findAccountByAccountNo(accountNo);
    }
}
