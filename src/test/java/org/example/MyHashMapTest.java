package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {

    @Test
    void put() {
        MyHashMap<Integer, String> hashMapCustom = new MyHashMap<Integer, String>();
        hashMapCustom.put(21, "Squad1");
        hashMapCustom.put(25, "Squad2");
        hashMapCustom.put(30, "Squad3");
        hashMapCustom.put(33, "Squad4");
        hashMapCustom.put(35, "Squad5");
        hashMapCustom.put(37, "Squad6");
        System.out.println("This is my source HashMap: ");
        hashMapCustom.display();
    }

    @Test
    void get() {
        MyHashMap<Integer, String> hashMapCustom = new MyHashMap<Integer, String>();
        hashMapCustom.put(21, "Squad1");
        hashMapCustom.put(25, "Squad2");
        hashMapCustom.put(30, "Squad3");
        hashMapCustom.put(33, "Squad4");
        hashMapCustom.put(35, "Squad5");
        hashMapCustom.put(37, "Squad6");
        System.out.println("\n" + "Test of get method, lets get Value under key 25: " + hashMapCustom.get(25));

    }

    @Test
    void remove() {
        MyHashMap<Integer, String> hashMapCustom = new MyHashMap<Integer, String>();
        hashMapCustom.put(21, "Squad1");
        hashMapCustom.put(25, "Squad2");
        hashMapCustom.put(30, "Squad3");
        hashMapCustom.put(33, "Squad4");
        hashMapCustom.put(35, "Squad5");
        hashMapCustom.put(37, "Squad6");
        hashMapCustom.remove(30);
        System.out.println("\n" + "This is my HashMap after remove: ");
        hashMapCustom.display();
        System.out.print("\n" + "HashMap size now is: ");
        hashMapCustom.size();
    }

    @Test
    void size() {
        MyHashMap<Integer, String> hashMapCustom = new MyHashMap<Integer, String>();
        hashMapCustom.put(21, "Squad1");
        hashMapCustom.put(25, "Squad2");
        hashMapCustom.put(30, "Squad3");
        hashMapCustom.put(33, "Squad4");
        hashMapCustom.put(35, "Squad5");
        hashMapCustom.put(37, "Squad6");
        System.out.print("\n" + "Source HashMap size is: ");
        hashMapCustom.size();
    }

    @Test
    void clear() {
        MyHashMap<Integer, String> hashMapCustom = new MyHashMap<Integer, String>();
        hashMapCustom.put(21, "Squad1");
        hashMapCustom.put(25, "Squad2");
        hashMapCustom.put(30, "Squad3");
        hashMapCustom.put(33, "Squad4");
        hashMapCustom.put(35, "Squad5");
        hashMapCustom.put(37, "Squad6");
        hashMapCustom.clear();
        hashMapCustom.display();
    }
}