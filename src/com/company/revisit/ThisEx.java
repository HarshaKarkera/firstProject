package com.company.revisit;

public class ThisEx {
    public static void main(String[] args) {
        A a= new A(10);
        a.display();
        A b= new A(20);
        b.display();

    }
}
class A
{
    int radius=20;

    public A(int radius) {
        this.radius = radius;
    }
    void display()
    {
        System.out.println(radius);
        System.out.println(this.radius);
    }
}
