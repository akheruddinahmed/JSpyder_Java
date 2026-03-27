package com.ExceptionHandling.throws_propagateException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwsexception {
    public static void main(String[] args) {
        try {
            m1();
        }catch (FileNotFoundException e){
            System.out.println("handled");
        }
    }
    public static void m1() throws FileNotFoundException{
        m2();
    }
    public static void m2() throws FileNotFoundException{
        FileReader f=new FileReader("/Users/akheruddinahmed/Desktop/JSpyder/src/com/ExceptionHandling/trycatch/Demo2.java");
    }
}
