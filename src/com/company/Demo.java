package com.company;

import java.util.Scanner;

class A
{
    void vol(int a ,int b)
    {
        int vol=a*b;
        System.out.println(vol);
    }
    void vol(int a)
    {
        int vol=a*a;
        System.out.println(vol);
    }
}



public class Demo
{
    public static void main(String[] args)
    {
        Scanner t=new Scanner(System.in);
        System.out.println("enter the number");
        int a= t.nextInt();
        int c= t.nextInt();
        A b=new A();
        b.vol(a);
        b.vol(a,c);

        System.out.println(a);



    }
}
