package com.Java8.OptionalClass;

import java.util.Optional;

public class Driver {

    public static String display(String name)
    {
       return Optional.ofNullable(name).orElse("VALUE IS NOT PRESENT" );
    }

    public static void main(String[] args) {
        System.out.println(display("Akher"));
        System.out.println(display(null));

//        String str="hii";
//        str=null;
//        System.out.println(str.length()); //nullpointerexc


//        String str="Hello";
        //if we pass null will get NullPointerException
//        Optional<String > of =Optional.of(str); //of() will accept only non null values
//        if (of.isPresent()){ //value is available or not
//            System.out.println(of.get());
//        }else {
//            System.out.println("value is not present");
//        }



       //Optional class introduced  to avoid null pointer exception

//        String str=null;
//        Optional<String > of =Optional.ofNullable(str); // ofNullable() will accept both non null value and  null vallue
//        if (of.isPresent()){ //value is available or not
//            System.out.println(of.get());
//        }else {
//            System.out.println("value is not present");
//        }


//        String str=null;
//        //Optional<String> of=Optional.of(str); //NullPointerException
//        Optional<String> of=Optional.ofNullable(str);//NoSuchElementException
//        System.out.println(of.get());
//        //for this we will get NoSuchElementException


        //String str="Hello";
//        String str=null;
//
//        String str1 =Optional.ofNullable(str).orElse("VALUE IS NOT PRESENT");
//        System.out.println(str1);






























    }
}
