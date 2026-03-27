package com.AdvProgramming.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a={2,3,4,5,6,7,7};
        System.out.println(find(a,9));

    }

    public static int find(int[] a,int key){
        int st=0;
        int end=a.length-1;
        while (st<=end){
            int mid=(st+end)/2;
            if (key==a[mid])
                return mid;
            else if (key<a[mid]) {
                end=mid-1;


            }
            else st=mid+1;
        }
        return -1;
    }
}
