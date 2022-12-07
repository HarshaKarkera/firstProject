package com.company.oops.interfaces;

public interface Engine

{
    static final int Price=7000;

    default void m1()
    {
        System.out.println("default of engine");
    }

    void start();
    void stop();
    void acc();

}
