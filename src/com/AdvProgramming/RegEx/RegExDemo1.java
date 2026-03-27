package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {
    public static void main(String[] args) {
        Pattern p=Pattern.compile(".a");
        Matcher m=p.matcher("banana");
        int count=0;
        while (m.find()){
            count++;
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
            System.out.println("------------");
        }
        System.out.println("Total cmatches="+count);
    }
}
