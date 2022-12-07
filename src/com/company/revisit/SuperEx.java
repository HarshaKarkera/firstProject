package com.company.revisit;

class G
{
    void m1()
    {
        System.out.println("m1 in G");
    }
}
class H extends G
{
    void m1()
    {
        System.out.println("m1 of H");
        super.m1();
    }

}

public class SuperEx
{
    public static void main(String[] args) {
        H h1= new H();
        h1.m1();

    }


}
