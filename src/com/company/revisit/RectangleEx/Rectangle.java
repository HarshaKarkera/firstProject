package com.company.revisit.RectangleEx;

public class Rectangle extends Shape{
    int length;
    int breadth;

    public Rectangle(String color, int length, int breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    void display()
    {
        System.out.println("length"+this.length);
        System.out.println("breadth id "+breadth);
        super.display();
    }

}
