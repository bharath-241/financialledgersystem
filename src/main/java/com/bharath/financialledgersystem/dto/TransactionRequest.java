package com.bharath.financialledgersystem.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.bharath.financialledgersystem.entity.TransactionType;

public class TransactionRequest {

    private BigDecimal amount;
    private TransactionType transactionType;
    private LocalDateTime transactionDate;

    public TransactionRequest() {
    }

    public TransactionRequest(BigDecimal amount, TransactionType transactionType, LocalDateTime transactionDate) {
        this.amount = amount;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}