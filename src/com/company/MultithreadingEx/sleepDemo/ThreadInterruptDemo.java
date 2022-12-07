package com.company.MultithreadingEx.sleepDemo;

import com.company.oops.encalpsulation.M;

public class ThreadInterruptDemo
{
    public static void main(String[] args) {
        MyThread t= new MyThread();
        t.start();
        //t.interrupt();
        System.out.println("END OF MAIN THREAD");
    }
}
