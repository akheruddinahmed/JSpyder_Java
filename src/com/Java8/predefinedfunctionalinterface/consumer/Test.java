package com.Java8.predefinedfunctionalinterface.consumer;

import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
//        Consumer<String> con=(String name)->{
//            System.out.println(name);
//        };

        Consumer<String> con=(name)->System.out.println(name);
        con.accept("Akher");
    }
}
