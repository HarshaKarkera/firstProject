package com.company.revisit;

class A1{
    static
    {
        System.out.println("static block A");
    }

    public A1()
    {
        System.out.println("A object is created");
    }
    static void m1()
    {
        System.out.println("m1 is executed");
    }
}

public class StaticEx
{
    public static void main(String[] args)
    {
        System.out.println("main is starts");
        A1.m1();
        System.out.println("m1 is started");
        new A1();
        System.out.println("first object");
        new A1();
        System.out.println("second object");
        System.out.println("MAinebds");
    }


}
