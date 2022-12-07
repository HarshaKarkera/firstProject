package com.company.day6;

import java.util.Scanner;

public class CheckCal
{
    public static void main(String[] args) {

            String option;
            Scanner obj = new Scanner(System.in);
            do {


                System.out.println("enter 2 numbers: ");
                int x = obj.nextInt();
                int y = obj.nextInt();
                System.out.println("enter the number to perform the operation: ");
                int perform = obj.nextInt();


                switch (perform) {

                    case 1:
                        add(x, y);

                        break;
                    case 2:
                        sub(x, y);
                        break;

                    case 3:
                        multiply(x, y);
                        break;

                    case 4:
                        divide(x, y);
                        break;

                    default:
                        System.out.println("Invalid option");
                        break;

                }
                System.out.println("If you want to perform the operation further type Y. To exit Type N");
                option = obj.next();
            }
            while (option.equals("y"));{

            }


        }

        public static void add(int a, int b) {
            System.out.println( a + b);

        }

        public static void sub(int a, int b) {
            System.out.println( a - b);
        }
        public static void multiply(int a, int b) {
            System.out.println( a * b);
        }

        public static void divide(int a, int b) {
            System.out.println( a / b);

        }

}
