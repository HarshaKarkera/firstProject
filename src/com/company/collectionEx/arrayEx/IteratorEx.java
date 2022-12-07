package com.company.collectionEx.arrayEx;

import com.company.oops.bookEx.Book;

import java.util.Set;
import java.util.TreeSet;

public class IteratorEx
{
    public static void main(String[] args) {
        Set p= new TreeSet();

        p.add(new Book(100,"abc",10.00));
        p.add(new Book(101,"dfg",20.00));
        p.add(new Book(101,"dfg",20.00));
        p.add(new Book(98,"gbf",5.00));

        System.out.println(p);



    }
}
