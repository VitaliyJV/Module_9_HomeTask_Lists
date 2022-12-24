package org.example;

public class Main {
    public static void main(String[] args) {
        var arrayList1 = new MyArrayListModel<>();
        arrayList1.addArrList("elem1");
        arrayList1.addArrList("elem2");
        arrayList1.addArrList("elem3");
        arrayList1.addArrList("elem4");
        System.out.println("This is my source ArrayList: ");
        arrayList1.printArrayList();
        arrayList1.removeFromArrList(2);
        System.out.println("This is my ArrayList after remove: ");
        arrayList1.printArrayList();
        System.out.println("Test of method getElementArrList: ");
        System.out.println(arrayList1.getElementArrList(1));
        arrayList1.clearArrList();
        System.out.println("At finish we have cleared our ArrayList:");
        arrayList1.printArrayList();
        System.out.println();

        var listLinked1 = new MyLinkedListModel<>();
        listLinked1.addToLinkedList("item1");
        listLinked1.addToLinkedList("item2");
        listLinked1.addToLinkedList("item3");
        listLinked1.addToLinkedList("item4");
        System.out.println("This is my source LinkedList: ");
        listLinked1.printLinkedList();
        System.out.println("Size of our LinkedList is: " + listLinked1.sizeOfLinkedList());
        listLinked1.removeFromLinkedList(2);
        System.out.println("This is my LinkedList after remove: ");
        listLinked1.printLinkedList();
        System.out.println("At finish we have cleared ourLinkedList: " + "\n");
        listLinked1.clearLinkedList();


        var queue = new MyQueue<>();
        queue.addToMyQueue("first");
        queue.addToMyQueue("second");
        queue.addToMyQueue("third");
        queue.addToMyQueue("fourth");
        System.out.println("This is my source Queue: ");
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
        System.out.println();

        var stack = new MyStack<>();
        stack.pushToStack("primary");
        stack.pushToStack("secondary");
        stack.pushToStack("thirded");
        stack.pushToStack("fourthed");
        System.out.println("This is my source Stack:");
        stack.printMyStack();
        System.out.println("MyStack size is: " + stack.sizeOfMyStack());
        stack.removeFromMyStackByIndex(2);
        System.out.println("This is my Stack after remove:");
        stack.printMyStack();
        System.out.println("Test of method 'peeking': " + stack.peek());
        stack.pool();
        System.out.println("Stack after 'pooling': ");
        stack.printMyStack();
        System.out.println("Stack after 'cleaning': ");
        stack.clearStack();
        stack.printMyStack();
        System.out.println();

        MyHashMap <String, Integer> hashMap1 = new MyHashMap<>(new MyHashMap.Node[12]);
        hashMap1.put("FirstKey", 1);
        hashMap1.put("SecondKey", 2);
        hashMap1.put("ThirdKey", 3);
        hashMap1.put("ForthKey", 4);
        hashMap1.put("FifthKey", 5);
        hashMap1.put("SixKey", 6);
        System.out.println(hashMap1.size());

    }
}