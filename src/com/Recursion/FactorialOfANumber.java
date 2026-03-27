package com.Recursion;

public class FactorialOfANumber {
    public static int  calFact(int n)
    {
        if (n==1||n==0) return 1;
        int factnm1=calFact(n-1);
        int factn=n*factnm1;
        return factn;
    }

    public static void main(String[] args) {
        int n=5;
        int res=calFact(n);
        System.out.println(res);
    }
}
