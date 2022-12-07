package com.company.FileEx;

import java.io.File;
import java.io.IOException;

public class FolderEx
{
    public static void main(String[] args) {
        File f=new File("E:\\java vedio\\hi\\hello.html");


        if (!f.exists())
        {
            try {
                System.out.println("file created ?"+f.createNewFile());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        //System.out.println(f.delete());


    }
}
