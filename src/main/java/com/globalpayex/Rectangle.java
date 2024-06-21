package com.globalpayex;

public class Rectangle {
    public Rectangle(int i, int i1) {
    }

    public static double calculateArea(double length, double breadth)
    {
        var area=(length*breadth);
        return area;
    }
    public static double calculatePerimeter(double length,double breadth)
    {
        return (2*(length+breadth));
    }

}
