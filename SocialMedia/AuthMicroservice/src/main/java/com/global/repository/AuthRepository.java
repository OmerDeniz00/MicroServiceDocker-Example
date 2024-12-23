package com.global.repository;

import com.global.entity.Auth;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<Auth, Long> {
    Boolean existsByUserNameAndPassword(String username, String password);
}
