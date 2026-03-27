package com.ComparableInterface;

public class Trainer implements Comparable {

    int tid;
    String tname;
    int tage;

    public Trainer(int tid,String tname,int tage){
        this.tid=tid;
        this.tname=tname;
        this.tage=tage;
    }

    public String toString(){
        return "[ Trainer Id: " +tid+ "Trainer Name: " +tname+ "Trainer Age:"+tage+ " ]";
    }

    public int compareTo(Object o){
        Trainer t=(Trainer)o;
        return this.tname.compareTo(t.tname);

    }


}
