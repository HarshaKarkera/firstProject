package com.company.ExceptionExample;

import java.util.Scanner;

public class OnlineShopping
{
    public static void main(String[] args) throws WrongNumberException {
        Scanner t=new Scanner(System.in);
        System.out.println("Enter the name and mobile number");
        String n=t.next();
        long m=t.nextLong();
        Registration r=new Registration();
        r.reg(n,m);
        System.out.println("registration complete");

    }
}
