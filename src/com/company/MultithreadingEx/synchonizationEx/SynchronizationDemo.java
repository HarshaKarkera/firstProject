package com.company.MultithreadingEx.synchonizationEx;

public class SynchronizationDemo
{
    public static void main(String[] args)
    {
        Display d= new Display();
        MyThread t1= new MyThread(d,"Dhoni");
        MyThread t2= new MyThread(d,"Yuvaraj");

        t1.start();
        t2.start();
    }
}
