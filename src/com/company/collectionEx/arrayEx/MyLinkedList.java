package com.company.collectionEx.arrayEx;

public class MyLinkedList
{
    Node start;
    Node last;
    int size=0;
    private class Node
    {
        Node x;
        Object ab;

         Node(Object ab)
        {
            this.ab=ab;
            size++;
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
        String t;
        Node temp=start;
        if(size==0)
        {
            t="[";
        }
        else
        {
            t="["+temp.ab;
            for(int i=1;i<size;i++)
            {
                temp=temp.x;
                t=t+","+temp.ab;
            }
            t+="]";
        }
        return t;
    }
    public int size()
    {
        return size;
    }
    public Object get(int index)
    {
        if (index<0 || index>=size) throw new IndexOutOfBoundsException();
        Node temp=start;
        for(int i=1;i<=index;i++)
        {
            temp=temp.x;
        }
        return temp.ab;
    }
    public Object remove(int index)
    {
        if(index<0 || index>=size)
        {
            throw new IndexOutOfBoundsException();
        }
        Node tmp= start;
        for(int i=1;i<index;i++)
        {
            tmp=tmp.x;
        }
        Node g= tmp;
        tmp=tmp.x;
        g.x=tmp.x;
        size--;
        return tmp.ab;


    }
}
