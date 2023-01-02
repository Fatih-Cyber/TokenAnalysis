package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.entity.CurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRateRepository extends JpaRepository<CurrencyRate,Long> {
}
