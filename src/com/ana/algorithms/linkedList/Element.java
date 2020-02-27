package com.ana.algorithms.linkedList;

public class Element {
    private String data;
    private Element /*prev = null,*/ next = null;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /*
    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }
    */

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }
}
