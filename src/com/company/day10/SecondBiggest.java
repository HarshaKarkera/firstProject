package com.company.day10;

import java.util.Arrays;
import java.util.Scanner;

public class SecondBiggest
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
        System.out.println(Arrays.toString(arr));

        int big=arr[0];
        int sbig=0;
        for(int i=0;i<size;i++)
        {
            if(big<arr[i])
            {
                sbig=big;
                big=arr[i];

            }
            else if (sbig<arr[i] && arr[i]!=big)
            {
                sbig=arr[i];
            }
        }
        System.out.println("the second biggest number is "+sbig);
    }

}
