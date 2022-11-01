package com.company.day8;

import java.util.Scanner;

public class Star2
{
    public static void main(String[] args)
    {
        System.out.println("Enter the size of the square");
        Scanner t= new Scanner(System.in);
        int n= t.nextInt();
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n; j++)
            {
                if (i == 1 || j == 1 || i == n || j == n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }

            }
            System.out.println();

        }
    }
}
