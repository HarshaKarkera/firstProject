package com.company.day10;

import java.util.Scanner;

public class Array1
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter each element");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }




    }

}
