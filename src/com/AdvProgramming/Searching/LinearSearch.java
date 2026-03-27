package com.AdvProgramming.Searching;

class LinearSearch {
    public static void main(String[] args) {
        int[]a={4,5,6,3,2,7};
        System.out.println(find(a,7));
    }
    public static int find(int[] a,int key){
        for (int i=0;i<a.length;i++){
            if (a[i]==key)
                return i;
        }
        return -1;
    }

}