package com.AdvProgramming.String;

class AllPallindrome {
    public static void main(String[] args) {
        String s="banana";
        for (int i=0;i<s.length()-1;i++)
        {
            for (int j=i+1;j<s.length();j++)
            {
                if (ispallindrome(s,i,j)){
                    System.out.println(s.substring(i,j+1));
                }

            }
        }
    }

    static boolean ispallindrome(String s,int start,int end){
        while (start<end){
            if (s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return  true;

    }
}