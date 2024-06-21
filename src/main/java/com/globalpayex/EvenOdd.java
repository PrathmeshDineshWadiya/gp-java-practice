package com.globalpayex;

public class EvenOdd {
    public static boolean isEven(int number)
    {
        return number % 2 ==0;
    }

    public static String isEvenOdd(int number)
    {
        return isEven(number)? "Even":"Odd";
    }

}
