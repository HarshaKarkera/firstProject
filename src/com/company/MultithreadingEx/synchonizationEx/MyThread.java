package com.company.MultithreadingEx.synchonizationEx;

public class MyThread extends Thread
{
    Display d;
    String name;
    MyThread(Display d,String name)
    {
        this.d=d;
        this.name=name;
    }

    @Override
    public void run()
    {
        d.wish(name);

    }
}
