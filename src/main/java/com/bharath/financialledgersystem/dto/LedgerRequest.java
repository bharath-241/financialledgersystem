package com.bharath.financialledgersystem.dto;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LedgerRequest {

    private String accountNumber;
    private String accountHolderName;
    private BigDecimal balance;

}