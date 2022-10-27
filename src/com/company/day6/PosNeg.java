package com.company.day6;

public class PosNeg
{
    public static void main(String[] args)
    {
        int num=0;
        testPosNeg(num);

    }

    public static void testPosNeg(int x)
    {
        if(x<0)
        {
            System.out.println(x+ "is negative");
        }
        else if (x>0)
        {
            System.out.println(x+ "is positive");
        }
        else
        {
            System.out.println(x+ "is neutral");
        }
    }
}
