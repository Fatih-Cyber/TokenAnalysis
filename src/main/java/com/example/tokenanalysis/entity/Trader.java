package com.example.tokenanalysis.entity;

import com.example.tokenanalysis.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "traders")
public class Trader extends BaseEntity{
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String userName;
    private String passWord;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany(mappedBy = "trader")
    private List<Wallet> wallet;

    @OneToMany(mappedBy = "seller")
    private List<Trade> sellTrade;
    @OneToMany(mappedBy = "buyer")
    private List<Trade> buyTrade;
    private String email;


}
