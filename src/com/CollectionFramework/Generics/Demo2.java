package com.CollectionFramework.Generics;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jsp");
        list.add("qsp");
        list.add("pysp");
        System.out.println(list.get(0)); //jsp
        String s1=(String)list.get(1);//qsp

        System.out.println("==============");
        List<String>  list1=new ArrayList<>();
        list1.add("jsp");
        list1.add("qsp");
        list1.add("pysp");
        System.out.println(list1.get(0)); //jsp
        String s2=list1.get(1); //qsp

    }
}

//aggregation
//interface
