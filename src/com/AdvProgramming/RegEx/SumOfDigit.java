package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfDigit {
    public static void main(String[] args) {
        String s="ab12cd345e";

        //Pattern p=Pattern.compile("[0-9]");
        Pattern p=Pattern.compile("[0-9]+");
        Matcher m=p.matcher(s);

        int sum=0;
        while (m.find()){
            sum+=Integer.parseInt(m.group());
        }
        System.out.println(sum);
    }
}
