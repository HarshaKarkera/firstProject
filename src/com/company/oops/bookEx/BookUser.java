package com.company.oops.bookEx;

public class BookUser
{
    public static void main(String[] args)
    {
        Book b1=new Book(101,"Harsha",95.45);
        System.out.println(b1);
        Book b2= new Book(101,"Harsha",90.00);
        System.out.println(b1.equals(b2));
        System.out.println(b1.compareTo(b2));
    }



}
