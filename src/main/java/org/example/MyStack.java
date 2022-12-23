package org.example;
import java.util.Arrays;
import java.util.Objects;

public class MyStack <E>{
        private int size;
        private static int capacity = 10;
        transient Object[] elementStack = new Object[capacity];
        transient Object[] elementsStackNewAfterRemove = new Object[capacity];
        public MyStack() {
            size = 0;
        }
        private void grow() {
            elementStack = Arrays.copyOf(elementStack, capacity+=1);
        }

        public void pushToStack(String value) {
            if (size == capacity) {
                grow();
            }
            elementStack[size] = value;
            size++;
        }

        public void clearStack() {
            for(Object elemToClear : elementStack) {
                elemToClear = null;
                size = 0;
            }
        }

        public int sizeOfMyStack() {
            return size;
        }

        public void removeFromMyStackByIndex(int index) {
            Objects.checkIndex(index, size);
            if(size == 0) {
                throw new RuntimeException("Nothing to remove! Stack is empty!");
            }
            elementStack[index] = null;
            size--;
            int countNewQueue = 0;
            for (int i = 0; i < elementStack.length; i++) {
                if (elementStack[i]!=null) {
                    elementsStackNewAfterRemove[countNewQueue] = elementStack[i];
                    countNewQueue++;
                }
            }
            elementStack = elementsStackNewAfterRemove.clone();
        }

        public E peek() {
            return (E) elementStack[size - 1];
        }

        public E pool() {
            if (size == 0) {
                throw new RuntimeException("Nothing to pool! Stack is empty!");
            }
            var forReturn = elementStack[size-1];
            elementStack[size-1] = null;
            size--;
            int countNewQueue = 0;
            for (int i = 0; i < elementStack.length; i++) {
                if (elementStack[i]!=null) {
                    elementsStackNewAfterRemove[countNewQueue] = elementStack[i];
                    countNewQueue++;
                }
            }
            elementStack = elementsStackNewAfterRemove.clone();
            return (E) forReturn;
        }

        public void printMyStack() {
            if(size == 0) {
                System.out.println("Stack is empty!");
            }
            for (int i = 0; i < size; i++) {
                System.out.println(elementStack[i]);
            }
        }
}
