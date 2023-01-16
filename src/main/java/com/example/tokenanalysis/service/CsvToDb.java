package com.example.tokenanalysis.service;

import com.example.tokenanalysis.DTO.TransactionDTO;
import com.example.tokenanalysis.entity.Account;
import com.example.tokenanalysis.entity.Transaction;
import com.example.tokenanalysis.service.AccountService;
import com.example.tokenanalysis.service.GetTransactionsFromCsv;
import com.example.tokenanalysis.service.TransactionService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.TimeZone;


@Service
public class CsvToDb implements CsvService{
    private final AccountService accountService;
    private final TransactionService transactionService;

    public CsvToDb(AccountService accountService, TransactionService transactionService) {
        this.accountService = accountService;
        this.transactionService = transactionService;
    }
    @Override
    public void writeCsvToDb(){
        GetTransactionsFromCsv reader=new GetTransactionsFromCsv();
        List<TransactionDTO> transactions=
                reader.readTransactionsCsv("/Users/iceman/Downloads/TokenAnalysis-master/token.csv");
        
        for(TransactionDTO dto:transactions){
            Transaction transaction= new Transaction();
            //Save fromAccount
            if (accountService.findByAccountNo(dto.getFromAccount())==null) {
                Account account=new Account();
                account.setAccountNo(dto.getFromAccount());
                accountService.save(account);
            }
            Account fromAccount=accountService.findByAccountNo(dto.getFromAccount());

            //Save toAccount
            if (accountService.findByAccountNo(dto.getToAccount())==null) {
                Account account=new Account();
                account.setAccountNo(dto.getToAccount());
                accountService.save(account);
            }
            Account toAccount=accountService.findByAccountNo(dto.getToAccount());

            transaction.setToAccount(toAccount);
            transaction.setFromAccount(fromAccount);
            transaction.setTxHash(dto.getTxHash());
            transaction.setDateTime(LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(dto.getDateTime())), TimeZone.getDefault().toZoneId()));
            transaction.setBlockNumber(dto.getBlockNumber());
            transaction.setQuantity(dto.getQuantity());
            transaction.setMethod(dto.getMethod());
            transactionService.save(transaction);
        }//End for.................
    }
}

