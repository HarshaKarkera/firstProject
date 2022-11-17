package com.company.oops.inheritance;

import org.jcp.xml.dsig.internal.dom.DOMUtils;

public class Main {
    public static void main(String[] args) {
        Box box1=new Box(2,3,4);
        Box box2=new Box(box1);
        System.out.println(box1.l+","+box1.w+","+ box1.h);

        BoxWieght box3=new BoxWieght();
        BoxWieght box4 =new BoxWieght(2,3,4,5);
        System.out.println(box3.h+","+box3.weight);

        Box box5=new BoxWieght(2,3,4,8);



    }
}
