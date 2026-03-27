package com.Java8.predefinedfunctionalinterface.biconsumer;

import java.util.function.BiConsumer;

public class Test {
    public static void main(String[] args) {
        BiConsumer<String,Integer> biConsumer=(name,age)->
                System.out.println("Name of the person is "+name+" age is "+age);
        biConsumer.accept("Akher",21);
    }
}
