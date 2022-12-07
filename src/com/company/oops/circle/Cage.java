package com.company.oops.circle;

public class Cage
{
    Animal a;

    public Cage(Animal a)
    {
        this.a = a;
    }
    void hit()
    {
        a.makesound();
    }


}
