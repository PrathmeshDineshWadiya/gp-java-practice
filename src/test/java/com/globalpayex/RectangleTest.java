package com.globalpayex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void calculateArea() {
        //test data
        var length = 10;
        var breadth = 4;
        var expected = 40;

        //test steps
        var actual = Rectangle.calculateArea(length,breadth);

        //Test assertion
        assertEquals(expected,actual);
    }

    @Test
    void calculatePerimeter() {
        //test data
        var length = 10;
        var breadth = 4;
        var expected = 28.0;

        //test steps
        var actual = Rectangle.calculatePerimeter(length,breadth);

        //Test assertion
        assertEquals(expected,actual);
    }
}