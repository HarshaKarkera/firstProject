package com.company.MultithreadingEx.yieldEx;

public class JoinDemo
{
    public static void main(String[] args) throws InterruptedException {
        MyThread t=new MyThread();
        t.start();
        t.join(10000);

    }
}
