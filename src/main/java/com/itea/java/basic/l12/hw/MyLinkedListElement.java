package com.itea.java.basic.l12.hw;

public class MyLinkedListElement {

    private Object value;
    private MyLinkedListElement prev;
    private MyLinkedListElement next;

    public MyLinkedListElement(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MyLinkedListElement getPrev() {
        return prev;
    }

    public void setPrev(MyLinkedListElement prev) {
        this.prev = prev;
    }

    public MyLinkedListElement getNext() {
        return next;
    }

    public void setNext(MyLinkedListElement next) {
        this.next = next;
    }
}
