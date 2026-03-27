package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {
    public static void main(String[] args) {

        Pattern p=Pattern.compile("a[0-9]{2}c");
        Matcher m=p.matcher("a35cabbca1234c");
        int count=0;
        while (m.find()){
            count++;
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.group());
            System.out.println("------------");
        }
        System.out.println("Total matches="+count);
    }
}
