package com.company.oops.cars;

public class Helper
{
    public static Car getObj(String name)
    {
        if(name.equalsIgnoreCase("Audi"))
        {
            return new Audi();
        }
        else if (name.equalsIgnoreCase("Bmw"))
        {
            return new Bmw();
        }
        else if (name.equalsIgnoreCase("Maruti"))
        {
            return new Maruti();

        }
        else
        {
            return null;
        }
    }
}
