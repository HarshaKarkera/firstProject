package com.company.day11;



public class StringEx
{
    public static void main(String[] args)
    {
        String str1="developer";
        String str2="DEVELOPER";
        StringBuilder a= new StringBuilder("JAVA");
        StringBuilder b=new StringBuilder("JAVA");
        if(a==b)
        {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println(a.substring(1, 2));
        System.out.println(str1.replace("v", ""));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.indexOf('e'));
        System.out.println(str2.substring(1,3));
        System.out.println(str1.substring(str1.length() - 1)+str1+str1.substring(str1.length() - 1));
        System.out.println(str1.charAt(0)+""+str1.charAt(1));
        System.out.println(str1.replace("vel",""));
        System.out.println((str1.replace("e","")).length());
        str2.charAt(0);


    }
}

