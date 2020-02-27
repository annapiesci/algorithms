package com.ana.algorithms.linkedList;

public class LinkedListExercises {

    public static void findMiddleElement(Element first, Element last) {
        Element tempI = first, tempJ = last;

        while(tempI != tempJ) {
            if(tempI.getNext() == tempJ) break;
            tempI = tempI.getNext();
           // tempJ = tempJ.getPrev();
        }

        System.out.println(tempI.getData());
    }

    public static void findMiddleElementV2(Element first) {
        Element tempI = first, tempJ = first;
        int i = 1;

        while(tempI.getNext() != null) {
            if (i % 2 == 0) tempJ = tempJ.getNext();
            tempI = tempI.getNext();
            i++;

        }

        System.out.println(tempJ.getData());
    }

    public static void reverseList(Element first) {
        printList(first);
        printList(reverse(first));
    }

    private static Element reverse(Element element) {

        Element curr = element, prev = null, first = element;
         while(curr != null) {
             prev = curr;
             curr = curr.getNext();
             first = curr;
             first.setNext(prev);
             prev.setNext(null);
         }
        return first;
        //temp = reverse(element.getNext());

        //temp.setNext(element);
    }

    private static void printList(Element first) {
        Element temp = first;
        while (temp != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println();
    }


    public static void test() {

        Element first, last;

        Element a = new Element(), b = new Element(), c = new Element() ,d = new Element() ,e = new Element();
        a.setData("not middle1");
        b.setData("not middle2");
        c.setData("MIDDLE");
        d.setData("not middle3");
        e.setData("not middle4");

        a.setNext(b);
        b.setNext(c);
        //b.setPrev(a);
        c.setNext(d);
        //c.setPrev(b);
        d.setNext(e);
        //d.setPrev(c);
        //e.setPrev(d);

        first = a;
        /*
        last = e;

        findMiddleElement(first,last);
        findMiddleElementV2(first);
        */
        reverseList(first);
    }
}
