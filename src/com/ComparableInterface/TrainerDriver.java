package com.ComparableInterface;

import java.util.Arrays;

public class TrainerDriver {
    public static void main(String[] args) {
        Trainer t1=new Trainer(5,"Ravesh",40);
        Trainer t2=new Trainer(3,"Ramana",30);
        Trainer t3=new Trainer(1,"Rahul",28);
        Trainer[] t={t1,t2,t3};
        Arrays.sort(t);
        for (Trainer tr:t)
        {
            System.out.println(tr);
        }

    }
}
