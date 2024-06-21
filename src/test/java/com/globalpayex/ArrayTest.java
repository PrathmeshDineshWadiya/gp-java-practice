package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTest {

    @Test
    void testArrayAverage(){
        int[] array = {0,5,7,3,1,10};
        float expected = 4.3333335F;

        var actual = Array.average(array);
        assertEquals(expected,actual);
    }

    @Test
    void testArrayMaximum(){
        int[] array = {0,5,7,3,1,10};
        var expected = 10;

        var actual = Array.maximum(array);
        assertEquals(expected,actual);
    }

    @Test
    void testNextGenSum(){
        var actual = Array.nextGenSum(5,2,4,8);
        assertEquals(19,actual);

        actual = Array.nextGenSum(5,2);
        assertEquals(7,actual);

        actual = Array.nextGenSum();
        assertEquals(0,actual);
    }

}