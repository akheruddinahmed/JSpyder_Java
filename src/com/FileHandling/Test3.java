package com.FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

//read the data from a file
public class Test3 {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("/Users/akheruddinahmed/Desktop/JSpyder/src/com/FileHandling/A.txt");
        int n=f.read();
        while (n!=-1) // if there is no character to read,then read() returns -1
        {
            System.out.print((char)n);
            n=f.read();
        }
        f.close();
    }
}
