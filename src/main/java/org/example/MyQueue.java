package org.example;

import java.util.Arrays;
import java.util.Objects;

public class MyQueue {

    private int size;
    private int capacity;
    private String[] elementsQ;

    public MyQueue() {
        capacity = 10;
        size = 0;
        elementsQ = new String[capacity];
    }

    private void grow() {
        elementsQ = Arrays.copyOf(elementsQ, capacity+=1);
    }

    public void addToMyQueue(String value) {
        if (size == capacity) {
            grow();
        }
        elementsQ[size] = value;
        size++;
    }

    public void clearQueue() {
        for(String elemToClear : elementsQ) {
            elemToClear = "";
            size = 0;
        }
    }

    public int sizeOfQueue() {
        return size;
    }

    public void removeFromMyQueue() {
        if(size == 0) {
            throw new RuntimeException("Nothing to remove! Queue is empty!");
        }
        elementsQ[0] = null;
        size--;
        String[] elementsQNewAfterRemove = new String[elementsQ.length];
        int countNewQueue = 0;
        for (int i = 0; i < elementsQ.length; i++) {
            if (elementsQ[i]!=null) {
                elementsQNewAfterRemove[countNewQueue] = elementsQ[i];
                countNewQueue++;
            }
        }
        elementsQ = elementsQNewAfterRemove.clone();
    }

    public String peek() {
        return elementsQ[0];
    }

    public String pool() {
        if (size == 0) {
            throw new RuntimeException("Nothing to pool! Queue is empty!");
        }
        String forReturn = elementsQ[0];
        elementsQ[0] = null;
        size--;
        String[] elementsQNewAfterRemove = new String[elementsQ.length];
        int countNewQueue = 0;
        for (int i = 0; i < elementsQ.length; i++) {
            if (elementsQ[i]!=null) {
                elementsQNewAfterRemove[countNewQueue] = elementsQ[i];
                countNewQueue++;
            }
        }
        elementsQ = elementsQNewAfterRemove.clone();
        return forReturn;
    }

    public void printMyQueue() {
        if(size == 0) {
            System.out.println("Queue is empty!");
        }
        for (int i = 0; i < size; i++) {
            System.out.println(elementsQ[i]);
        }
    }
}
