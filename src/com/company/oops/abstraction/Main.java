package com.company.oops.abstraction;

public class Main
{
    public static void main(String[] args) {
        Parent son=new Son() ;

        son.career();

        Parent daughter=new Daughter();
        daughter.career();
    }

}
