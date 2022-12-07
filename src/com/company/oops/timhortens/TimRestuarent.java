package com.company.oops.timhortens;

import java.util.Scanner;

public class TimRestuarent {
    public static TimCommon getobj(int a) {
        Scanner sc = new Scanner(System.in);
        if (a == 1) {
            System.out.println("Choose one of the option");
            System.out.println("1.coffee\n2.Bagel\n3.Wrap");
            int b = sc.nextInt();
            if (b == 1) return new Cofee();

            else if (b == 2) return new Bagel();

            else if (b == 3) return new Wrap();

            else {
                System.out.println("Invalid option");
                return null;
            }


        } else if (a == 2) {
            System.out.println("Choose one of the option");
            System.out.println("1. Mugs\n 2.CoffeePowder\n 3.GiftCard");
            int c = sc.nextInt();
            if (c == 1) return new Mugs();

            else if (c == 2) return new CoffeePowder();


            else if (c == 3) return new GiftCard();

            else {
                System.out.println("Invalid option");
                return null;
            }


        }
        else return null;
    }
}