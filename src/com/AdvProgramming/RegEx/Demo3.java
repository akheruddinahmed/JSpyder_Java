package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Quantifiers

public class Demo3 {
    public static void main(String[] args) {
        //Pattern p=Pattern.compile("a[0-9]");
        Pattern p=Pattern.compile("a[^0-9]");
        Matcher m=p.matcher("a1a5ab");
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
