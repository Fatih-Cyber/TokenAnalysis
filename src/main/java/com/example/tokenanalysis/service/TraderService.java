package com.example.tokenanalysis.service;

import com.example.tokenanalysis.DTO.TraderDTO;
import org.springframework.stereotype.Component;

import java.util.List;

public interface TraderService {
    List<TraderDTO> listAllTraders();

    TraderDTO findByUserName(String username);

    void save(TraderDTO trader);
    TraderDTO update(TraderDTO trader);
    void delete(String username);
}
