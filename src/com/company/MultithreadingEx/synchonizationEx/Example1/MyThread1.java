package com.company.MultithreadingEx.synchonizationEx.Example1;


public class MyThread1 extends Thread
{
    Display d;
    MyThread1(Display d)
    {
        this.d=d;
    }

    @Override
    public void run() {
        d.displayn();
    }
}
