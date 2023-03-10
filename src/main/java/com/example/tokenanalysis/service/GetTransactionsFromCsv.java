package com.example.tokenanalysis.service;

import com.example.tokenanalysis.DTO.TransactionDTO;
import com.example.tokenanalysis.entity.Transactions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//"/Users/faith/Documents/token.csv"
public class GetTransactionsFromCsv {
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static List<TransactionDTO> readTransactionsCsv(String filename){
        List<TransactionDTO> transactions = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(COMMA_DELIMITER);
                TransactionDTO transaction=new TransactionDTO();
                transaction.setTxhash(values[0]);
                transaction.setBlockno(values[1]);
                transaction.setUnixTimestamp(values[2]);
                transaction.setDateTime(values[3]);
                transaction.setFrom(values[4]);
                transaction.setTo(values[5]);
                transaction.setQuantity(values[6]);
                transaction.setMethod(values[7]);

                transactions.add(transaction);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        transactions.remove(0);
        return transactions.stream().filter(transaction -> transaction.getMethod().equals("Multicall")).limit(5).collect(Collectors.toList());

    }
}
