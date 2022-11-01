package com.company.day8;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class Star3
{
    public static void main(String[] args)
    {
        System.out.println("Enter the size of base");
        Scanner t= new Scanner(System.in);
        int base= t.nextInt();
        int space=base-1;
        for(int i=1; i<=base; i++)
        {
            for(int j=1; j<=space; j++)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }

        space--;
            System.out.println();
        }

    }
}
