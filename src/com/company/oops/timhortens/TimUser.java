package com.company.oops.timhortens;


import java.util.Scanner;

public class TimUser
{
    public static void main(String[] args)
    {

        Scanner t= new Scanner(System.in);
        System.out.println("Hello welcome to TimHortens");

        int op=0;
        TimCommon tc=null;
        double checkout[]=new double[10];
        String es=null;
        int i = 0;//counter
        double sum=0;
       do
       {

           System.out.println("Enter 1 for TimConsumable \n 2 for TimMerchandise");
           op = t.nextInt();
           tc=TimRestuarent.getobj(op);

           if(tc!=null)
           {
               System.out.println("You have ordered" +tc.toString()+"= $" +tc.getPrice());
               checkout[i] = tc.getPrice();
               System.out.println("Order Placed Successfully");
           }
           else {
               System.out.println("Something went wrong could you try again");
           }
           System.out.println("DO you want to exit or order again \n Select Y to order again or N to exit");
            es = t.next();
            i++;

       }
       while(es.equalsIgnoreCase("y"));
       //For Calculating total
        for(int j=0;j<checkout.length;j++)
        {
            sum=sum+checkout[j];
        }

        System.out.println("The total price of your order is $"+sum);
        System.out.println("Thank for your order at TimHortens");

    }

}
