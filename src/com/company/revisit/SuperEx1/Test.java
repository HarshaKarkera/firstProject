package com.company.revisit.SuperEx1;
 class A
{


}
class B extends A
{
   public B()
   {
       super();
       System.out.println("Db");

   }

}
class C extends B
{
    public C()
    {
        System.out.println("DC");
    }


}




public class Test {
    public static void main(String[] args) {
        B c= new B();

    }
}
