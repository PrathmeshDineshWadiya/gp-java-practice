package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;
import com.abc.geometry.ShapeStatistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testArea(){
        var r1 = new Rectangle(10,20);
        var expected = 200;

        int actual = r1.area();
        assertEquals(expected,actual);
    }

    @Test
    void testPerimeter(){
        var r1 = new Rectangle(10,20);
        var expected = 60;

        int actual = r1.perimeter();
        assertEquals(expected,actual);
    }

    @Test
    void testShapeStatistics(){
        var r1 = new Rectangle(10,20);
        var area = r1.area();
        var perimeter = r1.perimeter();
        var expected = "***\nArea: 200\nPeimeter: 60\n***";

        var actual = ShapeStatistics.calculate(r1);
        assertEquals(expected,actual);

    }

    @Test
    void testShapeStatisticsSquare(){
        var s1 = new Square(10);
        var area = s1.area();
        var perimeter = s1.perimeter();
        var expected = "***\nArea: 100\nPeimeter: 40\n***";

        var actual = ShapeStatistics.calculate(s1);
        assertEquals(expected,actual);

//      var shape = new Shape(); Cannot create an object of an Abstract class

    }
}