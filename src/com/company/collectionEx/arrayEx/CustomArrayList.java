package com.company.collectionEx.arrayEx;

import com.company.oops.bookEx.Book;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class CustomArrayList
{
    public static void main(String[] args)
    {
        ArrayList list=new ArrayList();
        list.add(45);
        list.add("java");
        list.add("developer");
        list.add(new Book(100,"Harsha",98.45));
        list.add(true);
        list.add(50);
        System.out.println(list);
        System.out.println(list.size());
        list.remove("45");
        System.out.println(list);

        MyArrayList ma= new MyArrayList();
        ma.add("java");
        ma.add("developer");
        ma.add(25);
        ma.add(50);
        System.out.println(ma);
        System.out.println(ma.getIndex(2));
        System.out.println(ma.size());
        ma.remove(2);
        System.out.println(ma);
        System.out.println(ma.size());
        System.out.println(ma.contains("java"));
        System.out.println(ma.add(2,45));
        System.out.println(ma);
        System.out.println(ma.size());

        MyLinkedList l3= new MyLinkedList();
        l3.add("java");
        l3.add("dev");
        l3.add(75);
        l3.add(100);
        System.out.println(l3);
        System.out.println(l3.size());
        System.out.println(l3.get(2));
        System.out.println(l3.remove(2));
        System.out.println(l3.size());
        System.out.println(l3);

        DoubleLinkedList l4=new DoubleLinkedList();
        l4.add("python");
        l4.add("dev");
        l4.add(75);
        l4.add(100);
        l4.add(80);
        System.out.println(l4);
        System.out.println(l4.get(3));

        Queue <Integer> q=new LinkedList();
        q.add(50);
        q.add(25);
        q.add(75);
        q.add(30);
        System.out.println(q.poll());
        System.out.println(q);
        Iterator r=q.iterator();
        System.out.println(r.hasNext());

        Queue<Book> b=new PriorityQueue();
        b.add(new Book(11,"abc",88.9));
        b.add(new Book(15,"def",90.0));
        b.add(new Book(16,"hjk",30.00));
        b.add(new Book(10,"abz",50.00));
        System.out.println(b);

        Set<Integer> s=new HashSet<Integer>();
        s.add(20);
        s.add(20);
        s.add(22);
        System.out.println(s);

        Set<Book> sd=new TreeSet<>();
        sd.add(new Book(100,"abc",10.00));
        sd.add(new Book(101,"dfg",20.00));
        sd.add(new Book(101,"dfg",20.00));
        sd.add(new Book(98,"gbf",5.00));
        System.out.println(sd);

        Set<Book> hs=new HashSet<Book>();

        Iterator i= sd.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }







    }
}
