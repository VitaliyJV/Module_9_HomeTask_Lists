package org.example;

public class MyLinkedListModel {
    public static class Node {                  // "Нода"
        private Node prev;                      // ссылка на предыдущий объект
        private Node next;                      // ссылка на следующий объект
        private String value;                   // целевое значение
    }

    private Node first = new Node();
    private Node last = new Node();

    public void add(String value) {
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
    }

    public void remove(int index) {


    }

    public int size() {
        if (first.next == null && last.prev == null) {
            int count=0;
        }


    }


    public String get(int index) {
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
}
