package com.company.oops.interfaces;

public interface Brake
{
    void brake();
    void start();
    default void m1()
    {
        System.out.println("default of brake");
    }

}
