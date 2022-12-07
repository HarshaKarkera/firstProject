package com.company.MultithreadingEx.synchonizationEx;

public class Display {
    public synchronized void wish(String name) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print("Good Morning:");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }
        }
    }
}
