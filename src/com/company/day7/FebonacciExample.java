package com.company.day7;


import java.util.Scanner;

public class FebonacciExample
{
    public static void main(String[] args)
    {
        System.out.println("Enter the count of Febonacci series");
        Scanner t= new Scanner(System.in);
        int num= t.nextInt();
        febonacciMet(num);

    }

    public static void febonacciMet(int count)
    {
        int num1=0;
        int num2=1;
        System.out.print(num1+" , "+num2);
        for (int i=2;i<count;i++)
        {
           int num3 = num1 + num2;
            System.out.print(" , "+num3);

            num1 = num2;
            num2 = num3;
        }
    }
}
