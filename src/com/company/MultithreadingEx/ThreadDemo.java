package com.company.MultithreadingEx;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println("child thread");
    }
    public void run(int i)
    {
        System.out.println("child 1 arg");
    }

}

public class ThreadDemo
{
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        System.out.println("main thread");
    }


}
