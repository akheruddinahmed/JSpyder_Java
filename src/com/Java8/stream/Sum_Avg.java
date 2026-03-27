package com.Java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Sum_Avg {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(null);
        list.add(1);
        list.add(5);


        //Sum
        int sum=list.stream().filter(e->e!=null).mapToInt(e->e).sum();
        System.out.println(sum);


        //Average
        double average=list.stream().filter(e->e!=null).mapToInt(e->e).average().getAsDouble();
        System.out.println(average);

    }
}
