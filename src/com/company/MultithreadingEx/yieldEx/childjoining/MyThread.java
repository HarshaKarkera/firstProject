package com.company.MultithreadingEx.yieldEx.childjoining;

public class MyThread extends Thread
{
    static Thread mt;
    public void run() {
        try {
            mt.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");


        }
    }
}
