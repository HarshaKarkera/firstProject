package com.company.oops.timhortens;

public class Cofee implements TimConsumables
{
    String name="coffee";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public double getPrice() {
        return 2.0;
    }

    @Override
    public int getCalories() {
        return 2000;
    }
}
