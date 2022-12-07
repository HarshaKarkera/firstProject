package com.company.MultithreadingEx;
public class YieldDemoUser
{
    public static void main(String[] args) {

        YieldDemo t= new YieldDemo();

        t.start();

        Thread.currentThread().getName();
        for(int i=0;i<10;i++)
        {
            System.out.println("main threads");
        }
    }
}
