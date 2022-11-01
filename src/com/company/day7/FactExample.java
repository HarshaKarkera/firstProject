package com.company.day7;

import java.util.Scanner;

public class FactExample
{
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial is to be determined");
        Scanner t= new Scanner(System.in);
        int num= t.nextInt();
        factorial(num);
    }

    public static void factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+n+" is "+fact);
    }

}
