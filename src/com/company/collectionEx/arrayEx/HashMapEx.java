package com.company.collectionEx.arrayEx;


import java.util.*;

public class HashMapEx
{
    public static void main(String[] args) {
        Map m= new HashMap();
        m.put(101,"ramesh");
        m.put(102,"durga");
        m.put(103,"suresh");
        m.put(104,"mahesh");
        System.out.println(m);

        System.out.println(m.put(101,"ram"));
        System.out.println(m);

        Set k=m.keySet();
        System.out.println(k);

        Collection v=m.values();
        System.out.println(v);

        Set sm= m.entrySet();
        System.out.println(sm);

        Iterator i=sm.iterator();
        while (i.hasNext())
        {
            Map.Entry e=(Map.Entry)i.next();
            System.out.println(e.getKey()+"..."+e.getValue());
            if(e.getKey().equals(103))
            {
                e.setValue("sur");
            }
        }
        System.out.println(m);
    }
}
