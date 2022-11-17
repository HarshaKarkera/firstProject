package com.company.oops.interfaces;

public class Powerengine implements Engine
{

    @Override
    public void start()
    {
        System.out.println("powerengine start");

    }

    @Override
    public void stop() {
        System.out.println("powerengine stop");

    }

    @Override
    public void acc() {
        System.out.println("powerengine accelerates");

    }
}
