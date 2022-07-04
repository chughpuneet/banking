package com.banking.accounts.controller;

import com.banking.accounts.persist.model.Account;
import com.banking.accounts.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("accounts")
public class AccountsController {

    @Autowired
    private AccountsRepository accountsRepository;

    @GetMapping("/customer/{customerId}")
    public Account getAccountDetails(@PathVariable("customerId") Integer customerId) {

        Account accounts = accountsRepository.findByCustomerId(customerId);
        if (accounts != null) {
            return accounts;
        } else {
            return null;
        }

    }
}
