package com.example.tokenanalysis.entity;

import com.example.tokenanalysis.enums.Gender;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "traders")
public class Trader extends BaseEntity{
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private boolean enabled;
    private String phone;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToMany(mappedBy = "trader")
    private ArrayList<Wallet> wallet;

    @OneToMany(mappedBy = "sellerId")
    private ArrayList<Trade> sellTrade;
    @OneToMany(mappedBy = "buyerId")
    private ArrayList<Trade> buyTrade;
    private String email;


}
