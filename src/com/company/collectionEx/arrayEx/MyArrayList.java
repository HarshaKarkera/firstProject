package com.company.collectionEx.arrayEx;

import java.util.Arrays;

public class MyArrayList
{
    private Object []  data;
    private int size;

    @Override
    public String toString()
    {
        if (size()==0) return "{ }";
        String s="["+data[0];
        for (int i=1;i<size();i++)
        {
            s+=","+data[i];
        }
        s+="]";
        return s;

    }

    public MyArrayList()
    {
        this.data=new Object[size];
        size=0;
    }
    public void add(Object ab)
    {
        if(size>= data.length)
        {
            resize();
        }
        data[size++]=ab;
    }
    private void resize()
    {
        Object [] temp= new Object[data.length+3];
        for(int i=0;i< data.length;i++)
        {
            temp [i]= data[i];
        }
        data=temp;
    }
    public Object getIndex(int index)
    {
        if(index<0 || index>=size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }
    public int size()
    {
        return size;
    }
     public void remove(int index)
     {
         if(index<0 || index>=size) throw new IndexOutOfBoundsException();
         for(int i=index+1;i<size();i++)
         {
             data [i-1]= data[i];
         }
         size--;
         data[size]=null;
     }
     public boolean contains(Object ab)
     {
         for(int i=0;i<size();i++)
         {
             if (data[i]==ab)
                 return true;

             }
         return false;
     }

     public boolean add(int index, Object ab)
     {
         if(index<0||index>=size()) throw new IndexOutOfBoundsException();
         resize();
         for(int i=index;i<size();i++)
         {
             data[i+1]=data[i];
         }
         data[index]=ab;
         size++;
         return true;

     }
}
