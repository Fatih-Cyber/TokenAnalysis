package com.example.tokenanalysis.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account extends BaseEntity {
    String accountNo;
    @OneToMany(mappedBy = "fromAccount")
    private List<Transaction> transferOut;
    @OneToMany(mappedBy = "toAccount")
    private List<Transaction> transferIn;
}
