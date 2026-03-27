package com.ExceptionHandling.trycatch;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound {
    public static void main(String[] args) {
        System.out.println("Main Start");
        try {
            FileReader f=new FileReader("/Users/akheruddinahmed/Desktop/JSpyder/src/com/ExceptionHandling/trycatch/Demo2.java");
            System.out.println("reading data");
        } catch (FileNotFoundException e) {
            System.out.println("handled");
        }
        System.out.println("main ends");

    }
}
