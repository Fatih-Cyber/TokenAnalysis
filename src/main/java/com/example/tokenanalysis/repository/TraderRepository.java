package com.example.tokenanalysis.repository;

import com.example.tokenanalysis.entity.Trader;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraderRepository extends JpaRepository<Trader,Long> {
}
