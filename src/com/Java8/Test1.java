package com.Java8;
//this is not functional interface
interface Sam{
    void fo();
    String toString();
    int hashCode();

}




public class Test1 implements Sam {
    @Override
    public void fo() {
        System.out.println("hii");
    }

    @Override
    public String toString() {
        return "Sammm";
    }


    public static void main(String[] args) {

    }
}
