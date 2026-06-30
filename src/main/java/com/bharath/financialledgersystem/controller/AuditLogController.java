package com.bharath.financialledgersystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bharath.financialledgersystem.entity.AuditLog;
import com.bharath.financialledgersystem.service.AuditLogService;

@RestController
@RequestMapping("/api/audit")
public class AuditLogController {

    @Autowired
    private AuditLogService auditLogService;

    @PostMapping("/create")
    public AuditLog createAuditLog(@RequestBody AuditLog request) {
        return auditLogService.createAuditLog(request);
    }

}