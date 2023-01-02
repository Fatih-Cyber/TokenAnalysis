package com.example.tokenanalysis.mapper;

import com.example.tokenanalysis.DTO.TraderDTO;
import com.example.tokenanalysis.DTO.WalletDTO;
import com.example.tokenanalysis.entity.Trader;
import com.example.tokenanalysis.entity.Wallet;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class TraderMapper {
    private final ModelMapper modelMapper;

    public TraderMapper(ModelMapper modelMapper) {this.modelMapper = modelMapper;}

    public Trader convertToEntity(TraderDTO dto){ return modelMapper.map(dto, Trader.class);}

    public TraderDTO convertToDto(Trader entity){
        return modelMapper.map(entity,TraderDTO.class);
    }
}
