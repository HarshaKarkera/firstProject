package com.company.MultithreadingEx;

class MyRunnable implements Runnable
{
    public void run() {
        System.out.println("child thread");
        System.out.println(Thread.currentThread().getName());
    }

    public void run(int i) {
        System.out.println("child 1 arg");
    }

}

public class RunnableEx
{
    public static void main(String[] args)
    {
        MyRunnable t= new MyRunnable();
        Thread k= new Thread(t);
        System.out.println(k.getPriority());
        k.start();
        System.out.println("main thread");
        System.out.println(Thread.currentThread().getName());
       // System.out.println(k.getName());
        Thread.currentThread().setName("Harsha");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        System.out.println(Thread.currentThread().getPriority());

    }


}
