package com.company.oops.circle;

public class Circle
{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    public String toString()
    {
      return "circle radius is "+radius;
    }
    void area()
    {
        System.out.println("Area is "+(3.14*radius*radius));
    }
    void circuma()
    {
        System.out.println("Circumference is"+(2*3.14*radius));
    }


}
