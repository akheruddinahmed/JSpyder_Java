package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumValidation {
    public static void main(String[] args) {
        String exp="[6789][0-9]{9}";
        String s="7002083738";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        if (m.matches()){
            System.out.println("Valid Mob No");
        }else
            System.out.println("Invalid Mob No");
    }
}
