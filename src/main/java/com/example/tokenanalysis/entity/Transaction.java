package com.example.tokenanalysis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="transactions")
public class Transaction extends BaseEntity{
    private String Txhash;
    private String Blockno;
    private String UnixTimestamp;
    private String DateTime;
    private String From;
    private String To;
    private String Quantity;
    private String Method;
}
