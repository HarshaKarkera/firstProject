package com.company.FileEx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingEx
{
    public static void main(String[] args) throws IOException {
        File f=new File("E:\\amar\\hi\\hello.txt");

        f.createNewFile();


        FileWriter w=new FileWriter("E:\\amar\\hi\\hello.txt",true);
        BufferedWriter b=new BufferedWriter(w);
       //Scanner sc= new Scanner(System.in);
        b.write("Hi good morning\n");
        b.write("How are you\n ");
        b.write("I am using the writing method\n");
        b.write("new line");
        //System.out.println("Input command");
        //w.write(sc.nextLine());

        b.flush();


    }
}
