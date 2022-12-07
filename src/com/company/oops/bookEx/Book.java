package com.company.oops.bookEx;

public class Book implements Comparable
{
    String name;
    int id;
    Double marks;


    public Book( int id,String name, Double marks)
    {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    public String toString()
    {
        return "\n name ="+name+ "\t id is"+id+"\t marks is "+marks;
    }
    public boolean equals(Object ab)
    {
        Book obj=(Book)ab;
        return ((this.id== obj.id)&&((this.name).equalsIgnoreCase(obj.name))&&(this.marks== obj.marks));
    }

    @Override
    public int compareTo(Object o)
    {
        Book obj1=(Book)o;
        return this.id-obj1.id;

    }
}
