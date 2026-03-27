package com.Java8.lamdafunction.ex1;

public class Sample  {

    public static void main(String[] args) {

    //    Demo d=new Sample(); // to achieve abstraction (conventional way not using lambda fn)

//        String str="Akher";
//        int a=10;
        //we are writing lambda fn for an interface, so it should be store in interface type
        //lamdba fn is nameless fn


        Demo d1=()-> {
            System.out.println("display from Unkonown class");
        };
        d1.display();
    }
}
