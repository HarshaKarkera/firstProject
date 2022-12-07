package com.company.MultithreadingEx;

public class ThreadPriorEx
{
    public static void main(String[] args) {
        MyThread r= new MyThread();


        System.out.println(Thread.currentThread().getName());
        r.setPriority(10);
        r.start();
       System.out.println(Thread.currentThread().getName()
       );

        for(int i=0;i<10;i++)
        {
            System.out.println("main threads");
        }
    }
}
