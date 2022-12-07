package com.company.oops.cars;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Main
{
    public static void main(String[] args)
    {
        Scanner t= new Scanner(System.in);
        System.out.println("Enter the car name");
        String na=t.next();
        Car p=null;
        p=Helper.getObj(na);
        p.Start();
        p.stop();
        p.acc();



    }
}
