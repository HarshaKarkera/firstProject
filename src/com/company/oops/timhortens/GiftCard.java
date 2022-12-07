package com.company.oops.timhortens;

public class GiftCard implements TimMerchandise
{
    String name="giftcard";
    @Override
    public double getPrice() {
        return 10.0;
    }

    @Override
    public void getFeature()
    {
        System.out.println("this is Gift Powder");

    }

    @Override
    public String toString() {
        return name;
    }
}
