package com.company.day10;

import java.util.Scanner;

public class Biggest
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of subject");
        int size=sc.nextInt();
        int marks[]=new int[size];
        System.out.println("enter each element");
        for(int i=0;i<size;i++)
        {
            marks[i] = sc.nextInt();
        }
        int highestMarks=marks[0];
        for(int i=0;i<marks.length;i++)
        {
            if(highestMarks<marks[i])
            {
                highestMarks=marks[i];
            }
        }
        System.out.println("the biggest number is "+highestMarks);

    }

}
