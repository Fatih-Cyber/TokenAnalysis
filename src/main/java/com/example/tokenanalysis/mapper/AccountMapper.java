package com.example.tokenanalysis.mapper;

import com.example.tokenanalysis.DTO.AccountDTO;
import com.example.tokenanalysis.DTO.TransactionDTO;
import com.example.tokenanalysis.entity.Account;
import com.example.tokenanalysis.entity.Transaction;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
   private final ModelMapper modelMapper;

    public AccountMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public Account convertToEntity(AccountDTO dto){ return modelMapper.map(dto,Account.class);}

    public AccountDTO convertToDto(Account entity){
        return modelMapper.map(entity,AccountDTO.class);
}
}