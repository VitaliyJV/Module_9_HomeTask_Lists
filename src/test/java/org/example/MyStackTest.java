package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    @Test
    void pushToStack() {
        var stack = new MyStack<>();
        stack.pushToStack("primary");
        stack.pushToStack("secondary");
        stack.pushToStack("thirded");
        stack.pushToStack("fourthed");
        System.out.println("This is my source Stack:");
        stack.printMyStack();
    }

    @Test
    void clearStack() {
        var stack = new MyStack<>();
        stack.pushToStack("primary");
        stack.pushToStack("secondary");
        stack.pushToStack("thirded");
        stack.pushToStack("fourthed");
        System.out.println("Stack after 'cleaning': ");
        stack.clearStack();
        stack.printMyStack();
    }

    @Test
    void sizeOfMyStack() {
        var stack = new MyStack<>();
        stack.pushToStack("primary");
        stack.pushToStack("secondary");
        stack.pushToStack("thirded");
        stack.pushToStack("fourthed");
        System.out.println("MyStack size is: " + stack.sizeOfMyStack());
    }

    @Test
    void removeFromMyStackByIndex() {
        var stack = new MyStack<>();
        stack.pushToStack("primary");
        stack.pushToStack("secondary");
        stack.pushToStack("thirded");
        stack.pushToStack("fourthed");
        stack.removeFromMyStackByIndex(2);
        System.out.println("This is my Stack after remove:");
        stack.printMyStack();
    }

    @Test
    void peek() {
        var stack = new MyStack<>();
        stack.pushToStack("primary");
        stack.pushToStack("secondary");
        stack.pushToStack("thirded");
        stack.pushToStack("fourthed");
        System.out.println("Test of method 'peeking': " + stack.peek());
    }

    @Test
    void pool() {
        var stack = new MyStack<>();
        stack.pushToStack("primary");
        stack.pushToStack("secondary");
        stack.pushToStack("thirded");
        stack.pushToStack("fourthed");
        stack.pool();
        System.out.println("Stack after 'pooling': ");
        stack.printMyStack();
    }
}