package com.example.springsecuriteh2.security.service;

import com.example.springsecuriteh2.security.entity.AppRole;
import com.example.springsecuriteh2.security.entity.AppUser;

import java.util.List;

public interface AccountService {
    AppUser addNewUser (AppUser appUser);
    AppRole addNewRole (AppRole appRole);
    void addRoleToUser (String username, String roleName);
    AppUser loadUserByUserName(String username);
    List<AppUser> listUsers();
}
