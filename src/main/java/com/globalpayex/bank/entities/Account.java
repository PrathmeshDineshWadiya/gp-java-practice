package com.globalpayex.bank.entities;

import com.globalpayex.bank.exceptions.LowBalException;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Account {
    private long accountNo;
    private AccType accountType;  // using an enum as datatype
    private double accountBalance;

    public static final String ACCTYPE_SAVINGS = "Savings";
    public static final String ACCTYPE_CURRENT = "Current";


    public Account(){

    }

    public Account(long accountNo, AccType accountType, double accounBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accounBalance;
    }

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public AccType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccType accountType) {
        /* if(accountType.equals(Account.ACCTYPE_SAVINGS) || accountType.equals(Account.ACCTYPE_CURRENT)) {
            this.accountType = accountType;
        } */
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double withdraw(double amount) throws LowBalException {
        System.out.println("Transaction Start...");
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount passed needs to be positive value");
            }
            if (this.accountBalance - amount < 1000) {
                throw new LowBalException("Account getting into Low Balance");
//            throw new IllegalStateException("Invalid State, Balance < 1000");
            }
            return this.accountBalance -= amount;
        }
        finally{
            System.out.println("Transaction Ends...");
        }
        }

    public double deposit(double amount){
        return this.accountBalance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNo=" + accountNo +
                ", accountType='" + accountType + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }

    public Optional<String> getAccountDetails(){
        if(this.accountNo == 0)
        {
            return Optional.empty();
        }
        else{
            return Optional.of(String.format(
                    "Account-No: %s\nAccount-Type: %s\nAccount-Balance: %s",
                    this.accountNo,
                    this.accountType,
                    this.accountBalance
            ));
        }

    }
}
