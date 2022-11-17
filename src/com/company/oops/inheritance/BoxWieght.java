package com.company.oops.inheritance;

public class BoxWieght extends Box
{
    double weight;
    public BoxWieght()
    {
        this.weight=-1;
    }

    public BoxWieght(double l, double h, double w, double weight)
    {
        super(l, h, w);
        this.weight = weight;
    }
}
