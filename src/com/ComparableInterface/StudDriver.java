package com.ComparableInterface;

import java.util.Arrays;

public class StudDriver {
    public static void main(String[] args) {
        Stud s1=new Stud("Akher",23,5);
        Stud s2=new Stud("Anis",21,2);
        Stud s3=new Stud("Gaurov",25,3);
        Stud s4=new Stud("Usman",24,1);

        Stud[]s={s1,s2,s3,s4};

        Arrays.sort(s);
        for (Stud ar:s){
            System.out.println(ar);
        }
    }
}
