package org.example;

import java.util.Objects;

public class MyLinkedListModel {
    private Node first = new Node();            //1й объект листа
    private Node last = new Node();             //последний объект листа
    private int countSize;

    public static class Node {                  // "Нода"
        private Node prev;                      // ссылка на предыдущий объект
        private Node next;                      // ссылка на следующий объект
        private String value;                   // целевое значение
    }
    public void addToLinkedList(String value) {
        Node newNode = new Node();
        newNode.value = value;
        if (first.next == null && last.prev == null) {
            first.next = newNode;
            last.prev = newNode;
        } else {
            Node preLast = last.prev;
            preLast.next = newNode;
            last.prev = newNode;
            newNode.prev = preLast;
        }
        countSize++;
    }

    public void removeFromLinkedList(int index) {
        Objects.checkIndex(index, countSize);
        Node prev = first;
        for (int i = 0; i < index-1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        countSize--;
    }

    public void clearLinkedList() {
        first=last=null;
    }

    public int sizeOfLinkedList() {
        return countSize;
    }
    public String get(int index) {
        Objects.checkIndex(index, countSize);
        Node next = first.next;
        if (index < 0) {
            return null;
        }
        for (int i = 0; i < index; i++) {
            if (next == null || next.next == null) {
                return null;
            }
            next = next.next;
        }
        return next.value;
    }


    @Override
    public String toString() {
        return "MyLinkedListModel{" +
                "first=" + first.value +
                '}';
    }

    public void printLinkedList() {
        Node current = first;
        for (int i = 0; i < countSize; i++) {
            current=current.next;
            System.out.println(current.value);
        }
    }
}

