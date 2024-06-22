package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.LowBalException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testNegativeAmtWithdraw(){
        Account a1 = new Account(101,AccType.Savings,1000);
        assertThrows(
                IllegalArgumentException.class,
                () -> a1.withdraw(-1000)
        );
    }


    @Test
    void testInvalidBalance(){
        Account a1 = new Account(101,AccType.Savings,1000);
        assertThrows(
                LowBalException.class,
                () -> a1.withdraw(1)
        );
    }

    @Test
    void testWithdrawDeposit(){
        Account a1 = new Account(101,AccType.Savings,2000);
        double balance = a1.deposit(100);
        assertEquals(2100.0,balance);
        try{
            balance = a1.withdraw(150);
        }
        catch(LowBalException e){
            System.out.println(e.getMessage());
        }
        assertEquals(1950.0,balance);
        a1
                .getAccountDetails()
                .ifPresent(details -> System.out.println(details.toUpperCase()));
        Account a2 = new Account();
        a2
                .getAccountDetails()
                .ifPresent(details -> System.out.println(details.toUpperCase()));
    }

    @Test
    void testEmptyAccount(){
        var account = new Account();
        assertEquals(0.0,account.getAccountBalance());

        account
                .getAccountDetails()
                .ifPresentOrElse(details -> System.out.println(details.toUpperCase()),() -> System.out.println("Account not initialized"));


        //null pointer check
        /* if(details != null){
            System.out.println(details.toUpperCase());
        }
        else {
            System.out.println("Account not initialized");
        } */


    }
}