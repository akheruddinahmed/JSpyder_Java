package com.AdvProgramming.String;

public class Encoding {
    public static void main(String[] args) {
        System.out.println(encode("java",3));
        System.out.println(encode("java",8));

    }

    static String encode(String s,int level){
        char[] a=s.toCharArray();
        char[] letters="abcdefghijklmnopqrstuvwxyz".toCharArray();

        String  s2="";
        for (int i=0;i<a.length;i++){
            int index=a[i]-97;
            index+=level;
            index=index%26;
            s2+=letters[index];

        }
        return s2;
    }
}
