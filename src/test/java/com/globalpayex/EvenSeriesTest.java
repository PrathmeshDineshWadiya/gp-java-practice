package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class EvenSeriesTest {
    @Test
    void testEvenSeries()
    {
        var num=7;
        var expected="0,2,4,6";

        var actual = EvenSeries.evenSeries(num);
        assertEquals(expected,actual);

        num=12;
        expected="0,2,4,6,8,10,12";

        actual = EvenSeries.evenSeries(num);
        assertEquals(expected,actual);
    }

}