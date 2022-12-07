package com.company.collectionEx.arrayEx;

import com.company.Day4.P;
import netscape.security.UserTarget;

public class DoubleLinkedList
{
    Node start;
    Node last;
    int size=0;

    private class Node
    {
        Node x;
        Node y;
        Object ab;

        public Node(Object ab)
        {
            this.ab = ab;
            size ++;
        }

    }
    public boolean add(Object ab)
    {
        if(start==null)
        {
            start=new Node(ab);
            last=start;
            return true;

        }
        last.x=new Node(ab);
        last.x.y=last;
        last=last.x;
        return true;
    }
    public boolean isEmpty()
    {
        if(size==0) return true;
        return false;
    }

    @Override
    public String toString()
    {
        String st;
        Node tmp=start;
        if (size==0)
        {
            st="[";
        }
        else st="["+tmp.ab;
        for(int i=1;i<size;i++)
        {
            tmp=tmp.x;
            st+=","+tmp.ab;
        }
        st=st+"]";
        return st;
    }
    public int size()
    {
        return size;
    }

    public Object get(int index)
    {
        Node temp;
        if(index>=size())
        {
            System.out.println("Index out of bound ");
            return null;

        }
        if(index<=size()/2)
        {
            temp=start;
            for(int i=1;i<=index;i++)
            {
                temp=temp.x;
            }
        }
        else
        {
            temp=last;
            for(int i=size()-1;i>index;i--)
            {
                temp=temp.y;
            }
        }
        return temp.ab;
    }
}
