package com.company.MultithreadingEx.sleepDemo;

public class MyThread extends Thread
{
    public void run()
    {
        try {
            for (int i=0;i<10;i++)
            {
                System.out.println("I am a lazy thread");
                Thread.sleep(5000);
            }
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}
