package com.company.oops;

public class StaticBlock {
    static int a=4;
    static int b;
    static{
        System.out.println("this is a static block");
        b= a*4;
    }

    public static void main(String[] args) {
        StaticBlock obj= new StaticBlock();
        System.out.println(a+","+b);
        StaticBlock.b+=3;
        System.out.println(a+","+b);
        StaticBlock obj1=new StaticBlock();
        System.out.println(a+","+b);


    }
}
