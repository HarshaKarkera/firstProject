package com.company.oops.timhortens;

public class Wrap implements TimConsumables
{
    String name="Wrap";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getPrice() {
        return 4.00;
    }

    @Override
    public int getCalories() {
        return 2500;
    }
}
