package com.company.revisit;

class C{
    int i;

    public C(int i) {
        this.i = i;
    }
    void display(C obj)
    {
        System.out.println(i);
        System.out.println(obj.i);
    }

}
public class ConstEx
{
    public static void main(String[] args)
    {
        C c1=new C(10);
        C c2= new C(20);
        C c3= new C(30);
        c1.display(c2);
        c1.display(c3);

    }



}
