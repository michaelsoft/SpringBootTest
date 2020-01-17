package com.michaelsoft.springboottest.service;

import com.michaelsoft.springboottest.entity.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService {
    void createAccount(Account account);

    void updateAccount(Account account);

    void deleteAccount(Account account);

    Optional<Account> getAccount(Integer id);

    List<Account> getAccounts();

    void transfer(Integer from, Integer to, Integer amount ) throws Exception;
}
