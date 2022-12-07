package com.company.MultithreadingEx.yieldEx.childjoining;

public class JoinDemoC
{
    public static void main(String[] args) throws InterruptedException {
        MyThread.mt=Thread.currentThread();

        MyThread t= new MyThread();
        t.start();
        t.join();
        for(int i=0;i<10;i++)
        {
            System.out.println("rama thread");
            Thread.sleep(2000);
        }

    }
}
