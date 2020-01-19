package com.michaelsoft.springboottest.service;
import com.michaelsoft.springboottest.entity.Account;
import com.michaelsoft.springboottest.repository.AccountRepository;
import com.michaelsoft.springboottest.service.impl.AccountServiceImpl;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class AccountServiceTest {
    @Autowired
    private AccountService accountService;

    @MockBean
    private AccountRepository accountRepository;

    @TestConfiguration
    static class AccountServiceImplTestContextConfiguration {

        @Bean
        public AccountService accountService() {
            return new AccountServiceImpl();
        }
    }

    @Before
    public void setUp() {
        Account from = new Account();
        from.setId(1);
        from.setBalance(100);

        Account to = new Account();
        to.setId(2);
        to.setBalance(100);

        Mockito.when(accountRepository.findById(1))
                .thenReturn(Optional.of(from));

        Mockito.when(accountRepository.findById(2))
                .thenReturn(Optional.of(to));
    }

    @Test
    public void get_account_normal() {
        Account account = accountService.getAccount(1).get();

        // then
        assertThat(account.getBalance()).isEqualTo(100);
    }


    @Test
    public void transfer_normal() {
//        try {
//            accountService.transfer(from.getId(), to.getId(), 10);
//        }
//        catch (Exception ex)
//        {
//
//        }
//
//        Optional<Account> fromOpt = accountService.getAccount(from.getId());
//        Optional<Account> toOpt = accountService.getAccount(to.getId());
//
//        // then
//        assertThat(fromOpt.get().getBalance()).isEqualTo(90);
//        assertThat(toOpt.get().getBalance()).isEqualTo(110);
    }

}
