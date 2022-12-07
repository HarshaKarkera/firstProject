package com.company.MultithreadingEx;



public class YieldDemo extends Thread
{
    public void run()
    {
        //Thread.yield();
        System.out.println("child thread");
        for(int i=0;i<10;i++)
        {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
