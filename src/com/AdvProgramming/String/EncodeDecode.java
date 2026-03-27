package com.AdvProgramming.String;

public class EncodeDecode {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(encode(s,2));
        System.out.println(decode(s,2));
    }
    public static String encode(String s,int n){
        char[] ch=s.toCharArray();
        for (int i=0;i<s.length();i++){
            if (ch[i]>='a' && ch[i]<='z')
                ch[i]=(char)  (((((ch[i]+n-'a')%26)+26)%26)+'a');
            else if (ch[i]>='A' && ch[i]<='Z')
                ch[i]=(char)  (((((ch[i]+n-'A')%26)+26)%26)+'A');
        }return new String(ch);
    }

    public static String decode(String s,int n){
        return encode(s,-n);
    }

}
