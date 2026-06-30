package com.bharath.financialledgersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.financialledgersystem.entity.Ledger;

public interface LedgerRepository extends JpaRepository<Ledger, Long> {

}