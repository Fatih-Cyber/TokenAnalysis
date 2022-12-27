package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.entity.Trade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TradeRepository extends JpaRepository<Trade,Long> {
}
