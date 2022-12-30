package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {

    @Test
    void addToMyQueue() {
        var queue = new MyQueue<>();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        System.out.println("This is my source Queue: ");
        queue.printMyQueue();
    }

    @Test
    void clearQueue() {
        var queue = new MyQueue<>();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        System.out.println("Queue after 'cleaning': ");
        queue.clearQueue();
        queue.printMyQueue();

    }

    @Test
    void sizeOfQueue() {
        var queue = new MyQueue<>();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        System.out.println("MyQueue size is: " + queue.sizeOfQueue());
    }

    @Test
    void removeFromMyQueue() {
        var queue = new MyQueue<>();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        queue.removeFromMyQueue();
        System.out.println("This is my Queue after remove:");
        queue.printMyQueue();

    }

    @Test
    void peek() {
        var queue = new MyQueue<>();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        System.out.println("Test of method 'peeking': " + queue.peek());
        System.out.println("Queue has not changed: ");
        queue.printMyQueue();

    }

    @Test
    void pool() {
        var queue = new MyQueue<>();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        queue.pool();
        System.out.println("Queue after 'pooling': ");
        queue.printMyQueue();

    }
}