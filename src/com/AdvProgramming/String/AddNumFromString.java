package com.AdvProgramming.String;

public class AddNumFromString {
    public static void main(String[] args) {
        String s1="sd46g56n2";
        int sum=0;
        for (int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if (c>='0' && c<='9'){
                sum+=(c-'0');
            }
        }
        System.out.println(sum);
    }
}
