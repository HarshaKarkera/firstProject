package com.company.day9;


import java.util.Scanner;

public class WhileEx
{
    public static void main(String[] args)
    {
        int thaughtnumber=(int) (Math.random()*10);
        System.out.println("I have thaught of a number its your turn to guess it");
        Scanner sc= new Scanner(System.in);
        int guessedno=sc.nextInt();

        while(guessedno!=thaughtnumber)
        {
            if(guessedno==thaughtnumber)
            {
                break;
            }
            else if (thaughtnumber<guessedno)
            {
                System.out.println("The guessed number is greater try again");
            }
            else
            {
                System.out.println("The guessed number is less try again");
            }
            guessedno=sc.nextInt();

        }

        System.out.println("THe guessed number is correct");

    }
}
