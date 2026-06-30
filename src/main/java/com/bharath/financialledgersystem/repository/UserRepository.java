package com.bharath.financialledgersystem.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.financialledgersystem.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}