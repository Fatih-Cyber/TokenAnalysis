package com.example.tokenanalysis.serviceimplementation;

import com.example.tokenanalysis.DTO.WalletDTO;
import com.example.tokenanalysis.service.WalletService;

import java.util.List;

public class WalletServiceImpl implements WalletService {
    @Override
    public WalletDTO getByAccountNo(String accountNo) {
        return null;
    }

    @Override
    public List<WalletDTO> listAllWalletByTrader(Long traderId) {
        return null;
    }

    @Override
    public void save(WalletDTO dto) {

    }

    @Override
    public void update(WalletDTO dto) {

    }

    @Override
    public void delete(String AccountNo) {

    }

    @Override
    public int getQuantityByAccountNo(String accountNo) {
        return 0;
    }

    @Override
    public int getQuantityByTraderId(String accountNo) {
        return 0;
    }
}
