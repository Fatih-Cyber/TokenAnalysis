package com.example.tokenanalysis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trades")
public class Trade extends BaseEntity{
    @ManyToOne
    private Trader sellerId;
    @ManyToOne
    private Trader buyerId;

    String sellerAccountNo;
    String buyerAccountNo;

}
