package com.company.oops.timhortens;

public class Mugs implements TimMerchandise
{
    String name="Mugs";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getPrice() {
        return 1.5;
    }

    @Override
    public void getFeature()
    {
        System.out.println("this is a mug");

    }
}
