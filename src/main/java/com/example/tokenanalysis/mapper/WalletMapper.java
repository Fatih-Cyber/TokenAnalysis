package com.example.tokenanalysis.mapper;

import com.example.tokenanalysis.DTO.WalletDTO;
import com.example.tokenanalysis.entity.Wallet;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class WalletMapper {
    private final ModelMapper modelMapper;

    public WalletMapper(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

    public Wallet convertToEntity(WalletDTO dto){ return modelMapper.map(dto,Wallet.class);}

    public WalletDTO convertToDto(Wallet entity){
        return modelMapper.map(entity,WalletDTO.class);
    }
}
