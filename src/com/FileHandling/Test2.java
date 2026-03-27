package com.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream f=new FileOutputStream("/Users/akheruddinahmed/Desktop/JSpyder/src/com/FileHandling/A.txt",true);//true is used for append the data in existing file
        String s="Miss you all";
        byte[] bytes=s.getBytes();
        System.out.println(Arrays.toString(bytes));
        f.write(bytes);
        //f.write(s); //cte

    }
}
