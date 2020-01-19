package com.michaelsoft.springboottest.controller;

import com.michaelsoft.springboottest.entity.Account;
import com.michaelsoft.springboottest.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AccountController {
    private Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/accounts")
    public int accountAdd(@RequestParam("balance") Integer balance) {
        logger.info("Start to create account " );
        Account account = new Account();
        account.setBalance(balance);
        accountService.createAccount(account);
        return  0;
    }

    @PostMapping(value = "/accounts/transfer")
    public void transfer(@RequestParam("from") Integer from, @RequestParam("to") Integer to, @RequestParam("amount") Integer amount) {
        try {
            accountService.transfer(from, to, amount);
        }
        catch (Exception ex)
        {
            logger.error(ex.toString());
        }
    }


}
