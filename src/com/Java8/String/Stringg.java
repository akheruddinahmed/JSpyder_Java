package com.Java8.String;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stringg {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("kartik");
        names.add("karan");
        names.add("Gowtaom");
        names.add("govardan");
        names.add("kartik");

        System.out.println("names starts with k");
       //names.stream().filter(e->e.startsWith("k")).forEach(e-> System.out.println(e));


   //     Map<String,Long> collect =names.stream().filter(e->e.startsWith("k")).collect(Collectors.groupingBy(e->e,Collectors.counting()));
//        System.out.println(collect);

        //occurance of employee

        Map<String,Long> collect =names.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
        System.out.println(collect);

        //employee starts with a(h/w)
    }
}

