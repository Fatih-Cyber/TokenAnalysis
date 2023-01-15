package com.example.tokenanalysis.service.implementations;

import com.example.tokenanalysis.entity.Transaction;
import com.example.tokenanalysis.mapper.TransactionMapper;
import com.example.tokenanalysis.repository.TransactionRepository;
import com.example.tokenanalysis.service.TransactionService;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;

    public TransactionServiceImpl(TransactionRepository transactionRepository, TransactionMapper transactionMapper) {
        this.transactionRepository = transactionRepository;
        this.transactionMapper = transactionMapper;
    }

    @Override
    public void save(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    @Override
    public Transaction findByTxHash(String txHash) {
        return transactionRepository.findTransactionByTxHash(txHash);
    }
}
