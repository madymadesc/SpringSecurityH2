package com.example.springsecuriteh2.security.repository;

import com.example.springsecuriteh2.security.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository <AppUser, Long> {
    AppUser findByUsername (String username);
}
