package com.ComparableInterface;

import java.util.Arrays;

public class EmpDriver {
    public static void main(String[] args) {
        Emp e1=new Emp("Ram",29,1);
        Emp e2=new Emp("Raj",48,0);
        Emp e3=new Emp("Sweety",26,2);
        Emp e4=new Emp("Tara",21,4);
        Emp e5=new Emp("Kavya",27,3);

        Emp[]e={e1,e2,e3,e4,e5};
        Arrays.sort(e);
        for(Emp emp:e)
            System.out.println(emp);



    }
}
