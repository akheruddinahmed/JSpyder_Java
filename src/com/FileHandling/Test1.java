package com.FileHandling;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File folder = new File("/Users/akheruddinahmed/Desktop/JSpyder/src/com/FileHandling/MyFolder");
        System.out.println(folder.mkdir());// create new folder

        File f = new File("/Users/akheruddinahmed/Desktop/JSpyder/src/com/FileHandling/A.txt");

        System.out.println("File created: " + f.createNewFile());
        System.out.println("Can Execute: " + f.canExecute());
        System.out.println("Can Write: " + f.canWrite());
        System.out.println("Can Read: " + f.canRead());
        System.out.println("Absolute Path: " + f.getAbsolutePath());
        File f1 = new File("/Users/akheruddinahmed/Desktop/JSpyder/src/com/FileHandling/A.txt");
        System.out.println("Renamed: " + f.renameTo(f1));


    }
}
