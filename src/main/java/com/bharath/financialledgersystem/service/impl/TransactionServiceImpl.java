package com.bharath.financialledgersystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.financialledgersystem.dto.TransactionRequest;
import com.bharath.financialledgersystem.entity.Transaction;
import com.bharath.financialledgersystem.repository.TransactionRepository;
import com.bharath.financialledgersystem.service.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public Transaction createTransaction(TransactionRequest request) {

        Transaction transaction = new Transaction();

        transaction.setAmount(request.getAmount());
        transaction.setTransactionType(request.getTransactionType());
        transaction.setTransactionDate(request.getTransactionDate());

        return transactionRepository.save(transaction);
    }
}