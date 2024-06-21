package com.globalpayex.geometry.entities;

import com.abc.geometry.Shape;

public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

//    public int areaSquare()
//    {
//        return this.side*this.side;
//    }
//
//    public int perimeterSquare()
//    {
//        return 4*this.side;
//    }

    @Override
    public int area() {
        return this.side*this.side;    }

    @Override
    public int perimeter() {
        return 4*this.side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


}
