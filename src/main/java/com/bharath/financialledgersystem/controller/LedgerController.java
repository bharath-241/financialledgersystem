package com.bharath.financialledgersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bharath.financialledgersystem.dto.LedgerRequest;
import com.bharath.financialledgersystem.entity.Ledger;
import com.bharath.financialledgersystem.service.LedgerService;

@RestController
@RequestMapping("/api/ledger")
public class LedgerController {

    @Autowired
    private LedgerService ledgerService;

    @PostMapping("/create")
    public Ledger createLedger(@RequestBody LedgerRequest request) {
        return ledgerService.createLedger(request);
    }

}