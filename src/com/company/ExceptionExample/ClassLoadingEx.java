package com.company.ExceptionExample;

class Example{
    static int d;
    static {
        System.out.println("static block executed");
    }
}
public class ClassLoadingEx
{
    public static void main(String[] args)
    {
        try{
            Class.forName("com.company.ExceptionExample.Exaple");
        } catch (ClassNotFoundException e) {
            System.out.println("class not found ");;
        }

    }
}
