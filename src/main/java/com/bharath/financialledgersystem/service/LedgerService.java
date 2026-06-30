package com.bharath.financialledgersystem.service;

import com.bharath.financialledgersystem.dto.LedgerRequest;
import com.bharath.financialledgersystem.entity.Ledger;

public interface LedgerService {

    Ledger createLedger(LedgerRequest request);

}