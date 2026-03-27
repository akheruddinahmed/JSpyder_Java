package com.ComparableInterface;

public class Stud implements Comparable {
    String name;
    int age;
    int id;

    public Stud(String name,int age,int id)
    {
        this.name=name;
        this.age=age;
        this.id=id;
    }
    @Override
    public String toString(){

        return "Student[name ="+name+ ",age=" +age +", id="+id + "]";
    }

    @Override
    public int compareTo(Object o)
    {
        Stud s=(Stud) o;
        return this.name.compareTo(s.name);
    }


}
