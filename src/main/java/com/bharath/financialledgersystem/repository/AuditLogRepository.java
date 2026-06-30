package com.bharath.financialledgersystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.financialledgersystem.entity.AuditLog;

public interface AuditLogRepository extends JpaRepository<AuditLog, Long> {

}