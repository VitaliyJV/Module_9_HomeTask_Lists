package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListModelTest {

    @Test
    void addToLinkedList() {
        var listLinked1 = new MyLinkedListModel<>();
        listLinked1.addToLinkedList("item1");
        listLinked1.addToLinkedList("item2");
        listLinked1.addToLinkedList("item3");
        listLinked1.addToLinkedList("item4");
        System.out.println("This is my source LinkedList: ");
        listLinked1.printLinkedList();
    }

    @Test
    void removeFromLinkedList() {
        var listLinked1 = new MyLinkedListModel<>();
        listLinked1.addToLinkedList("item1");
        listLinked1.addToLinkedList("item2");
        listLinked1.addToLinkedList("item3");
        listLinked1.addToLinkedList("item4");
        listLinked1.removeFromLinkedList(2);
        System.out.println("This is my LinkedList after remove: ");
        listLinked1.printLinkedList();
    }

    @Test
    void clearLinkedList() {
        var listLinked1 = new MyLinkedListModel<>();
        listLinked1.addToLinkedList("item1");
        listLinked1.addToLinkedList("item2");
        listLinked1.addToLinkedList("item3");
        listLinked1.addToLinkedList("item4");
        System.out.println("At finish we have cleared ourLinkedList: " + "\n");
        listLinked1.clearLinkedList();
    }

    @Test
    void sizeOfLinkedList() {
        var listLinked1 = new MyLinkedListModel<>();
        listLinked1.addToLinkedList("item1");
        listLinked1.addToLinkedList("item2");
        listLinked1.addToLinkedList("item3");
        listLinked1.addToLinkedList("item4");
        System.out.println("Size of our LinkedList is: " + listLinked1.sizeOfLinkedList());
    }

    @Test
    void get() {
        var listLinked1 = new MyLinkedListModel<>();
        listLinked1.addToLinkedList("item1");
        listLinked1.addToLinkedList("item2");
        listLinked1.addToLinkedList("item3");
        listLinked1.addToLinkedList("item4");
        System.out.println("Let's get the third item from MyLinkedList: " + listLinked1.get(2));

    }
}