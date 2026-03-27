package com.ComaparatorMiniProject;

import java.util.Comparator;

public class SortByName implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.name.compareTo(m2.name);


    }
}

class SortByPrice implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return (int)(m1.price-m2.price);
    }
}

class SortByPriceDec implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return (int)(m2.price-m1.price);
    }
}

class SortByRam implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.ram-m2.ram;
    }
}

class SortByRamDec implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m2.ram-m1.ram;
    }
}

class SortByRom implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.rom-m2.rom;
    }
}

class SortByRomDec implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m2.rom-m1.rom;
    }
}

class SortByColor implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Mobile m1=(Mobile) o1;
        Mobile m2=(Mobile) o2;
        return m1.color.compareTo(m2.color);
    }
}




