package com.AdvProgramming.String;

public class AddFullNumFromString {
    public static void main(String[] args) {
        String s1="sd46g56n2";
        int sum=0;
        int num=0;
        for (int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if (c>='0' && c<='9'){
                num=(num*10)+(c-'0');
            }else {
                sum+=num;
                num=0;
            }
        }
        sum+=num;
        System.out.println(sum);
    }
}
