package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GmailValidation {
    public static void main(String[] args) {
        String exp="[a-z][a-z 0-9]+@gmail[.]com";
        String s="akher@gmail.com";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        if (m.find()){
            System.out.println("Valid Gmail");
            //System.out.println(m.group());
        }else
            System.out.println("Invalid Gmail");
    }
}
