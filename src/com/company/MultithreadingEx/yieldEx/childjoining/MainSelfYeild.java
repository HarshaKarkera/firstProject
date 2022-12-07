package com.company.MultithreadingEx.yieldEx.childjoining;

public class MainSelfYeild
{
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().join();
        System.out.println("done");

    }
}
