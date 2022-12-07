package com.company.revisit;

import java.util.Scanner;

public class PrimeEx
{
    public static void main(String[] args)
    {
        System.out.println("enter the range of numbers");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=1;i<num;i++)
        {
            if(isPrime(i)) System.out.println(i+" is prime numbers");
            else System.out.println(i+" is anot prime");
        }

    }

    static boolean isPrime(int n)
    {
        if(n<=1)return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0) return false;
        }
        return true;

    }

}

