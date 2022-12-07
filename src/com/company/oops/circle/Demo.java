package com.company.oops.circle;

public class Demo
{
    public static void main(String[] args)
    {
        Cage dog= new Cage(new Dog());
        dog.hit();
        Cage cat=new Cage(new Cat());
        cat.hit();


    }


}
