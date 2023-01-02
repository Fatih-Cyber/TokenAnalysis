package com.example.tokenanalysis.service.implementations;

import com.example.tokenanalysis.DTO.WalletDTO;
import com.example.tokenanalysis.mapper.MapperUtil;
import com.example.tokenanalysis.service.WalletService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletServiceImpl implements WalletService {
    MapperUtil mapper;

    public WalletServiceImpl(MapperUtil mapper) {
        this.mapper = mapper;
    }

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
