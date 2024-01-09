package com.thoughtworks.rectangle;

public class Rectangle {
    private final double length;
    private final double breadth;
    public Rectangle(double Length,double Breadth){
        this.length=Length;
        this.breadth=Breadth;

    }
    public double area() {
        return length*breadth;
    }
    public double perimeter() {
        return 2*(length+breadth);
    }
}