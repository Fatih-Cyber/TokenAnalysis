package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.DTO.TraderDTO;
import com.example.tokenanalysis.entity.Trader;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TraderRepository extends JpaRepository<Trader,Long> {

    List<Trader> findAll();
    Trader findByUserName(String username);
}
