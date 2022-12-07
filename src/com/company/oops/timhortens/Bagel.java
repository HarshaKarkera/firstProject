package com.company.oops.timhortens;

public class Bagel implements TimConsumables
{
    String name="Bagel";

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int getCalories() {
        return 1500;
    }

    @Override
    public double getPrice() {
        return 3.00;
    }
}
