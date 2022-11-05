package com.company.day10;

import java.util.Scanner;

public class marksSum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the  number of subject");
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("enter marks in each subject");
        int marksSum=0;
        for(int i=0;i<size;i++)
        {
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            marksSum+=marks[i];
        }
        System.out.println("Total marks is"+marksSum);

    }

}
