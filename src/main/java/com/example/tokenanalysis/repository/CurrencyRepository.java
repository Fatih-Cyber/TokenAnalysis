package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
