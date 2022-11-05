package com.company.day10;

import java.util.Random;
import java.util.Scanner;

public class MultidimArrayColSum
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of student");
        int row=sc.nextInt();
        System.out.println("Enter number of subject");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        Random random=new Random();
        System.out.println("enter each element");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = random.nextInt(100);
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int total=0;
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                total+=arr[j][i];
            }
            System.out.println("Sum of subject number "+(i+1)+" is "+total);
            total=0;
        }


    }
}
