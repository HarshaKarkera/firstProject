package com.company.oops;

import java.beans.SimpleBeanInfo;

public class SingleMain
{

    public static void main(String[] args)
    {
        SingletonEx obj= SingletonEx.getInstance();
        System.out.println(obj);
        SingletonEx obj1= SingletonEx.getInstance();
        System.out.println(obj1);



    }

}
