package com.company.FileEx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingEx
{
    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("D:\\intellij\\MyNewProj\\src\\com\\company\\FileEx\\ReadingEx.java");
        BufferedReader br = new BufferedReader(r);
        String st = br.readLine();
        while (st!=null) {
            System.out.println(st);
            st=br.readLine();
        }
    }
}
