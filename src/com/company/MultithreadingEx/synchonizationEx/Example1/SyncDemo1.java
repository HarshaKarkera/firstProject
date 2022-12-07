package com.company.MultithreadingEx.synchonizationEx.Example1;

public class SyncDemo1
{
    public static void main(String[] args)
    {
        Display g= new Display();
        MyThread1 t1= new MyThread1(g);
        MyThread2 t2= new MyThread2(g);
        t1.start();
        t2.start();

    }
}
