package com.company.ExceptionExample;

public class ExpPropogation
{
    public static void main(String[] args)
    {
        System.out.println("main starts");
        m1();
        System.out.println("main ends");


    }

    private static void m1()
    {
        System.out.println("m1 starts");
        try{
            m2();
        } catch (ArithmeticException e) {
            e.printStackTrace();

        }
        System.out.println("m1 ends");
    }

    private static void m2()
    {
        System.out.println("m2 starts");
        int c=10/0;
        System.out.println("m2 ends");
    }
}
