package com.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file=new File("/Users/akheruddinahmed/Desktop/JSpyder/src/com/FileHandling/A.txt");
        FileWriter f=new FileWriter(file);
        if(file.canWrite()) //for validation
        {
            f.write("JSp\n");
            f.write("PSp\n");
            f.write("QSp\n");
        }else
            System.out.println("can't write");
        f.close();
    }
}
