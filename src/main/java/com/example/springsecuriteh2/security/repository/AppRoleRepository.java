package com.example.springsecuriteh2.security.repository;

import com.example.springsecuriteh2.security.entity.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    AppRole findByRoleName (String roleName);
}
