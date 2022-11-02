package com.company.day9;

import java.util.Scanner;

public class CalculatorSwitch
{
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Enter 1 for addition,2 for subtraction, 3 for multiplication, 4 for devision or else do nothing");
        int op= sc.nextInt();
        switch (op)
        {
            case 1:add(a,b);
                    break;
            case 2: sub(a,b);
                    break;
            case 3: mult(a,b);
                    break;
            case 4: div(a,b);
                    break;
            default:
                System.out.println("Invalid option");
        }

    }
    public static void add(int a,int b)
    {
        System.out.println("addition of number "+a+"and "+b+" is "+(a+b));
    }
    public static void sub(int a, int b)
    {

        System.out.println("Subtraction of number "+a+"and "+b+" is "+(a-b));

    }
    public static void mult(int a, int b)
    {
        System.out.println("Multiplication of number "+a+"and "+b+" is "+(a*b));
    }
    public static void div(double a, double b)
    {
        System.out.println("Division of number "+a+"and "+b+" is "+(a/b));
    }
}
