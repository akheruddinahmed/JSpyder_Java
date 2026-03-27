package com.AdvProgramming.RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
        String exp="(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{4,6}";
        String s="Js@123";
        Pattern p=Pattern.compile(exp);
        Matcher m=p.matcher(s);
        if (m.matches()){
            System.out.println("Valid Pswd");
        }else
            System.out.println("Invalid Pswd");
    }
}
