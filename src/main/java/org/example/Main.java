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

        MyHashMap<Integer, String> hashMapCustom = new MyHashMap<Integer, String>();
        hashMapCustom.put(21, "Squad1");
        hashMapCustom.put(25, "Squad2");
        hashMapCustom.put(30, "Squad3");
        hashMapCustom.put(33, "Squad4");
        hashMapCustom.put(35, "Squad5");
        hashMapCustom.put(37, "Squad6");
        System.out.println("This is my source HashMap: ");
        hashMapCustom.display();
        System.out.print("\n" + "Source HashMap size is: ");
        hashMapCustom.size();
        hashMapCustom.remove(30);
        System.out.println("\n" + "This is my HashMap after remove: ");
        hashMapCustom.display();
        System.out.print("\n" + "HashMap size now is: ");
        hashMapCustom.size();
        System.out.println("\n" + "Test of get method, lets get Value under key 25: " + hashMapCustom.get(25));
        hashMapCustom.clear();
        hashMapCustom.display();

    }
}