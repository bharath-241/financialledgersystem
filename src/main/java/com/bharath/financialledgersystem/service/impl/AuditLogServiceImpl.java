package com.bharath.financialledgersystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bharath.financialledgersystem.entity.AuditLog;
import com.bharath.financialledgersystem.repository.AuditLogRepository;
import com.bharath.financialledgersystem.service.AuditLogService;

@Service
public class AuditLogServiceImpl implements AuditLogService {

    @Autowired
    private AuditLogRepository auditLogRepository;

    @Override
    public AuditLog createAuditLog(AuditLog request) {

        AuditLog auditLog = new AuditLog();

        auditLog.setAction(request.getAction());
        auditLog.setUsername(request.getUsername());
        auditLog.setActionTime(request.getActionTime());

        return auditLogRepository.save(auditLog);
    }

}