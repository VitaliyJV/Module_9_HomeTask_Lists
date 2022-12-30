package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListModelTest {

    @Test
    void addArrList() {
        var arrayList1 = new MyArrayListModel<>();
        arrayList1.addArrList("elem1");
        arrayList1.addArrList("elem2");
        arrayList1.addArrList("elem3");
        arrayList1.addArrList("elem4");
        System.out.println("This is my source ArrayList: ");
        arrayList1.printArrayList();
    }

    @Test
    void removeFromArrList() {
        var arrayList1 = new MyArrayListModel<>();
        arrayList1.addArrList("elem1");
        arrayList1.addArrList("elem2");
        arrayList1.addArrList("elem3");
        arrayList1.addArrList("elem4");
        arrayList1.removeFromArrList(2);
        System.out.println("This is my ArrayList after remove: ");
        arrayList1.printArrayList();
    }

    @Test
    void clearArrList() {
        var arrayList1 = new MyArrayListModel<>();
        arrayList1.addArrList("elem1");
        arrayList1.addArrList("elem2");
        arrayList1.addArrList("elem3");
        arrayList1.addArrList("elem4");
        arrayList1.clearArrList();
        System.out.println("At finish we have cleared our ArrayList:");
        arrayList1.printArrayList();
    }

    @Test
    void getElementArrList() {
        var arrayList1 = new MyArrayListModel<>();
        arrayList1.addArrList("elem1");
        arrayList1.addArrList("elem2");
        arrayList1.addArrList("elem3");
        arrayList1.addArrList("elem4");
        System.out.println("Test of method getElementArrList: ");
        System.out.println(arrayList1.getElementArrList(1));
    }

}