package com.example.tokenanalysis.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Transactions extends BaseEntity{
    private String txHash;
    private String blockNo;
    private String unixTimeStamp;
    private String dateTime;
    private String sender;
    private String receiver;
    private String quantity;
    private String method;
}
