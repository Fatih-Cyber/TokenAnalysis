package com.example.tokenanalysis.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Currency extends BaseEntity{

    @Column(unique = true)
    String code;
    @Column(unique = true)
    String name;
    private boolean isBaseCurrency;

}
