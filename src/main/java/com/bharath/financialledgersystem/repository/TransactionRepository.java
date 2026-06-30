package com.bharath.financialledgersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.financialledgersystem.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}