package org.example;

import java.util.Arrays;
import java.util.Objects;

public class MyQueue <E>{
    private int size;
    private static int capacity = 10;
    transient Object[] elementsQ = new Object[capacity];
    transient Object[] elementsQNewAfterRemove = new Object[capacity];
    public MyQueue() {
        size = 0;
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
        for(Object elemToClear : elementsQ) {
            elemToClear = null;
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
        int countNewQueue = 0;
        for (int i = 0; i < elementsQ.length; i++) {
            if (elementsQ[i]!=null) {
                elementsQNewAfterRemove[countNewQueue] = elementsQ[i];
                countNewQueue++;
            }
        }
        elementsQ = elementsQNewAfterRemove.clone();
    }

    public E peek() {
        return (E) elementsQ[0];
    }

    public E pool() {
        if (size == 0) {
            throw new RuntimeException("Nothing to pool! Queue is empty!");
        }
        var forReturn = elementsQ[0];
        elementsQ[0] = null;
        size--;
        int countNewQueue = 0;
        for (int i = 0; i < elementsQ.length; i++) {
            if (elementsQ[i]!=null) {
                elementsQNewAfterRemove[countNewQueue] = elementsQ[i];
                countNewQueue++;
            }
        }
        elementsQ = elementsQNewAfterRemove.clone();
        return (E) forReturn;
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
