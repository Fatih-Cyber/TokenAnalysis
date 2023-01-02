package com.example.tokenanalysis.service;

import com.example.tokenanalysis.DTO.WalletDTO;

import java.util.List;

public interface WalletService {
    WalletDTO getByAccountNo(String accountNo);
    List<WalletDTO> listAllWalletByTrader(Long traderId);
    void save(WalletDTO dto);
    void update(WalletDTO dto);
    void delete(String AccountNo);

    int getQuantityByAccountNo(String accountNo);
    int getQuantityByTraderId(String accountNo);
}
