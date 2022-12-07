package com.company.oops.timhortens;

public class CoffeePowder implements TimMerchandise
{
    String name="coffe Powder";
    @Override
    public double getPrice() {
        return 3.5;
    }

    @Override
    public void getFeature()
    {
        System.out.println("this is Coffee powder");

    }

    @Override
    public String toString() {
        return name;
    }
}
