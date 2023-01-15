package com.example.tokenanalysis.mapper;

import com.example.tokenanalysis.DTO.TransactionDTO;
import com.example.tokenanalysis.DTO.WalletDTO;
import com.example.tokenanalysis.entity.Transaction;
import com.example.tokenanalysis.entity.Wallet;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TransactionMapper {
    private final ModelMapper modelMapper;

    public TransactionMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public Transaction convertToEntity(TransactionDTO dto){ return modelMapper.map(dto,Transaction.class);}

    public TransactionDTO convertToDto(Transaction entity){
        return modelMapper.map(entity,TransactionDTO.class);
    }
}
