package com.ComparatorInterface;

public class Emp {
    String name;
    int age;
    int id;

    public Emp(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Emp [name=" + name + ", age=" + age + ", id=" + id + "]";
    }
}