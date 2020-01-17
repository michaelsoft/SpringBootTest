package com.michaelsoft.springboottest.service.impl;

import com.michaelsoft.springboottest.entity.Account;
import com.michaelsoft.springboottest.repository.AccountRepository;
import com.michaelsoft.springboottest.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public void deleteAccount(Account account) {
        accountRepository.delete(account);
    }

    @Override
    public Optional<Account> getAccount(Integer id) {
        return accountRepository.findById(id);
    }

    @Override
    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW,rollbackFor = Exception.class)
    public void transfer(Integer from, Integer to, Integer amount ) throws Exception {
        Optional<Account> fromAccountOpt = this.getAccount(from);
        Optional<Account> toAccountOpt = this.getAccount(to);
        Account fromAccount = fromAccountOpt.get();
        Account toAccount = toAccountOpt.get();
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);
        accountRepository.save(fromAccount);
       //if (to == 2)
            //throw new Exception();
        accountRepository.save(toAccount);
    }


}
