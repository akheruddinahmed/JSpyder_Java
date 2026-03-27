package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ForwardSlash {
    public static void main(String[] args) {
        String exp = "([a-z])([a-z])\\2";
        String s = "abacacdddeeff";
        Pattern p = Pattern.compile(exp);
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());

        }
    }
}
