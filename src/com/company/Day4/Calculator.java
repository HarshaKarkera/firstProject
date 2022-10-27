package com.company.Day4;

public class Calculator
{
    public static void main(String[] args)
    {
        int addition=add(4,5);
        int subtraction=sub(7,6);
        int multiply=mult(4,5);
        int devide=div(5,5);

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiply);
        System.out.println(devide);
    }
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int sub(int a, int b)
    {
        return a-b;

    }
    public static int mult(int a, int b)
    {
        return a*b;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }
}
