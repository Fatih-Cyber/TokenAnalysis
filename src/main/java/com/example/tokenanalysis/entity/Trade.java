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
public class Trade extends BaseEntity{
    @ManyToOne
    private Trader seller;
    @ManyToOne
    private Trader buyer;

    private String sellerAccountNo;
    private String buyerAccountNo;

}
