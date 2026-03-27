package com.Recursion;

public class XPown {
    public static int calcPower(int x,int n) {
        if (n == 0) return 1; //base case 1
        if (x == 0) return 0; //base case 2
//Time complexity = O(n)
//        int xPowm1=calcPower(x,n-1); //kaam
//        int xPown=x*xPowm1;
//        return xPown;



        //Time complexity = O(logn)
        //if n is even
        if (n % 2 == 0) {
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        } else {//n is odd
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
        }
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
