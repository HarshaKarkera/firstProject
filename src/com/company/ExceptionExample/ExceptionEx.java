package com.company.ExceptionExample;

import com.company.oops.bookEx.Book;
import com.company.oops.cars.Audi;
import com.company.oops.cars.Car;

import java.util.Scanner;

public class ExceptionEx
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Audi i=new Audi();
        int c =0;
        try {
            i.Start();
            c = a / b;
            System.out.println("try block ends");

        } catch (ArithmeticException e)
        {
            System.out.println("denominator cannot be zero");
            System.out.println("Enter different number other than zero");
           b=sc.nextInt();
           try{
               c=a/b;
           } catch (ArithmeticException g) {
               System.out.println("CANT YOU UNDERSTAND THE OPERATION HAS BEEN TERMINATED");
           }


        }
        catch (NullPointerException k)
        {

        }

        System.out.println("good morning");
        System.out.println(c);


    }
}
