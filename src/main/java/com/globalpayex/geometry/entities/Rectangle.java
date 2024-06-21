package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;

public class Rectangle extends Shape {

    private int length;
    private int breadth;

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

//    public int calculateArea()
//    {
//        var area=(this.length*this.breadth);
//        return area;
//    }
//
//    public int calculatePerimeter()
//    {
//        return (2*(this.length+this.breadth));
//    }

//    public String getDetails(){
//        // implicit parameter - this - address of the current object
//        return String.format(
//                "Length: %s\nBreadth: %s",
//                this.length,
//                this.breadth
//        );
//    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    @Override
    public int area() {
        return this.length*this.breadth;
    }

    @Override
    public int perimeter() {
        return (2*(this.length+this.breadth));
    }
}
