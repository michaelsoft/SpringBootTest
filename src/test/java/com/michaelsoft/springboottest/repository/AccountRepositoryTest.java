package com.michaelsoft.springboottest.repository;

import com.michaelsoft.springboottest.entity.Account;
import org.junit.*;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace= AutoConfigureTestDatabase.Replace.NONE)
public class AccountRepositoryTest {
    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private AccountRepository repository;

    @Test
    public void testExample() throws Exception {
        Account account = new Account();
        //account.setId(1);
        account.setBalance(100);

        this.entityManager.persist(account);
        Optional<Account> accountOptional = this.repository.findById(1);
        assertThat(accountOptional).isNotNull();
        assertThat(accountOptional.get().getBalance()).isEqualTo(100);
    }
}
