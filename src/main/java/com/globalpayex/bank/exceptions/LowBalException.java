package com.globalpayex.bank.exceptions;

public class LowBalException extends Exception{
    public LowBalException(String message) {
        super(message);
    }
}
