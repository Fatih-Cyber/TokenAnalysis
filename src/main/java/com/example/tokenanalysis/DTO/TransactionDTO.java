package com.example.tokenanalysis.DTO;

import com.example.tokenanalysis.entity.BaseEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Data
@AllArgsConstructor
public class
TransactionDTO{
    private String Txhash;
    private String Blockno;
    private String UnixTimestamp;
    private String DateTime;
    private String From;
    private String To;
    private String Quantity;
    private String Method;
}
