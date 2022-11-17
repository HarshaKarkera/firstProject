package com.company.oops;

public class SingletonEx
{
    static SingletonEx instance;
    private SingletonEx()
    {
        System.out.println("first instance is created");
    }

    public static SingletonEx getInstance()
    {
        if (instance==null)
        {
            instance=new SingletonEx();
        }
        return instance;
    }
}
