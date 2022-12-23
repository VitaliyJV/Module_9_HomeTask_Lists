package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        var arrayList1 = new MyArrayListModel();
        arrayList1.addArrList("elem1");
        arrayList1.addArrList("elem2");
        arrayList1.addArrList("elem3");
        arrayList1.addArrList("elem4");
        System.out.println("This is my source Array List:");
        arrayList1.printArrayList();
        arrayList1.removeFromArrList(2);
        System.out.println("This is my Array List after remove:");
        arrayList1.printArrayList();
        System.out.println("Test of method getElementArrList:");
        System.out.println(arrayList1.getElementArrList(1));
        arrayList1.clearArrList();
        System.out.println("At finish we have cleared our ArrayList:");
        arrayList1.printArrayList();
        System.out.println();

        var listLinked1 = new MyLinkedListModel();
        listLinked1.addToLinkedList("item1");
        listLinked1.addToLinkedList("item2");
        listLinked1.addToLinkedList("item3");
        listLinked1.addToLinkedList("item4");
        System.out.println("This is my source Linked List:");
        listLinked1.printLinkedList();
        System.out.println("Size of our Linked List is: " + listLinked1.sizeOfLinkedList());
        listLinked1.removeFromLinkedList(2);
        System.out.println("This is my Linked List after remove:");
        listLinked1.printLinkedList();
        System.out.println("At finish we have cleared ourLinked List:");
        listLinked1.clearLinkedList();

        var queue = new MyQueue();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        System.out.println("This is my source Queue:");
        queue.printMyQueue();
        System.out.println("MyQueue size is: " + queue.sizeOfQueue());
        queue.removeFromMyQueue();
        System.out.println("This is my Queue after remove:");
        queue.printMyQueue();
        System.out.println("Test of method 'peeking': " + queue.peek());
        System.out.println("Queue has not changed: ");
        queue.printMyQueue();
        queue.pool();
        System.out.println("Queue after 'pooling': ");
        queue.printMyQueue();
        System.out.println("Queue after 'cleaning': ");
        queue.clearQueue();
        queue.printMyQueue();
    }
}