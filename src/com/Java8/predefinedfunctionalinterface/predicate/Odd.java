package com.Java8.predefinedfunctionalinterface.predicate;


//wap to check odd numbers are present or not in a integer array
//not correct way because every time it created new object

import java.util.function.Predicate;

public class Odd {
    public static void main(String[] args) {
        int arr[]={2,7,6,4,8,9};
        for(int num1:arr)
        {
            Predicate<Integer> pr=num->num%2!=0;
            System.out.println(pr.test(num1));
        }
    }
}
