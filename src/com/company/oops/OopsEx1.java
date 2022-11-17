package com.company.oops;

public class OopsEx1
{
    public static void main(String[] args) {
         Student s1= new Student();
         s1.changeName("shoe lover");
         s1.m1();
          Student s2=new Student(2,"rahul",98);
         s2.m1();
         Student s3=new Student(s2);
         s2.m1();

    }
}
class Student
{
    int no;
    String name;
    double marks;

    Student() {
        this.no = 100;
        this.name = "harsha";
        this.marks = 98;
    }
     Student(Student other)
     {
         this.no= other.no;
         this.name= other.name;
         this.marks= other.marks;
     }

    Student(int no, String name, double marks )
    {
        this.no=no;
        this.name=name;
        this.marks=marks;
    }
    void m1()
    {
        System.out.println(this.no);
        System.out.println(this.name);
        System.out.println(this.marks);

    }
    void changeName( String newname)
    {
        name=newname;
    }
}
