package com.ComparatorInterface;

import java.util.Comparator;

public class SortByAge implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        return e1.age-e2.age;
    }
//   	•	If e1.age > e2.age → result is positive → e1 comes after e2
//	•	If e1.age < e2.age → result is negative → e1 comes before e2
//	•	If equal → 0 → no change
}


// default (non-public) classes
class SortById implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        return Integer.compare(e1.id, e2.id);
    }
}

class SortByName implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {
        return e1.name.compareTo(e2.name);
    }
}