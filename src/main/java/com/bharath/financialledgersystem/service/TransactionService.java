package com.bharath.financialledgersystem.service;

import com.bharath.financialledgersystem.dto.TransactionRequest;
import com.bharath.financialledgersystem.entity.Transaction;

public interface TransactionService {

    Transaction createTransaction(TransactionRequest request);

}