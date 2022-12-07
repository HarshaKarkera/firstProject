package com.company.collectionEx.arrayEx;

import com.company.oops.bookEx.Book;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx
{
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(45);
        list.add("java");
        list.add("developer");
        list.add(true);
        list.add(50);

        ListIterator l= list.listIterator();
        System.out.println(list);

        while (l.hasNext()) {
            System.out.println(l.next());
        }
    }
}
