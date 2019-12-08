package com.itea.java.basic.l12.hw;

public interface MyList extends MyCollection {

    void add(Object o);

    void add(int index, Object o);

    Object get(int index);

    boolean remove(Object o);

    boolean remove(int i);
}
