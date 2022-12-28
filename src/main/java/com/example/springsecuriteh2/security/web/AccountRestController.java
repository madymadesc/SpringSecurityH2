package com.example.springsecuriteh2.security.web;

import com.example.springsecuriteh2.security.entity.AppUser;
import com.example.springsecuriteh2.security.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountRestController {

    private AccountService accountService;

    public AccountRestController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/users")
    public List<AppUser> appUserList(){
        return accountService.listUsers();
    }
}
