package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTest {

    @Test
    void isEven() {
        var num=8;
        var expected=true;

        var actual = EvenOdd.isEven(num);
        assertEquals(expected,actual);
    }

    @Test
    void isEvenOdd() {
        var num=8;
        var expected="Even";

        var actual = EvenOdd.isEvenOdd(num);
        assertEquals(expected,actual);
    }


}