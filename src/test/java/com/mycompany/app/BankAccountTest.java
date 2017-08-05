package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Администратор on 04.08.2017.
 */
public class BankAccountTest {
    private RestTemplate restTemplate;

    @Before
    public void setUp() throws Exception {
        restTemplate = new RestTemplate();

    }

    @Test
    public void infoBankAccountTest() throws Exception {
        BankAccount bankAccount = restTemplate.getForObject("http://kn-ktapp.herokuapp.com/apitest/accounts/12345678",BankAccount.class);
        System.out.println(bankAccount);
    }

    @Test
    public void infoBankAccountsTest() throws Exception {
        BankAccount[] bankAccounts = restTemplate.getForObject("http://kn-ktapp.herokuapp.com/apitest/accounts",BankAccount[].class);
        for(int i = 0; i < bankAccounts.length; i++){
            System.out.println(bankAccounts[i]);
        }
    }
}
