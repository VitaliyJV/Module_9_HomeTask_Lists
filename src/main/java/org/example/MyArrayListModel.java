package org.example;
import java.util.Arrays;
import java.util.Objects;

public class MyArrayListModel {
    private int size;                           // количесвто элементов
    private int capacity;                       // вместимость списка
    private String[] elements;                  // создаем "подкапотный" массив для списка

    public MyArrayListModel() {                 // конструктор
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    private void grow() {                       // метод grow(), который увеличивает вместимость списка в 1,5
        elements = Arrays.copyOf(elements, capacity *= 1.5);
    }

    public void addArrList(String element) {           // метод по добавлению элемента в список
        if (size == capacity) {                 // проверка, заполнили ли мы список(массив "под капотом" точнее)
            grow();
        }
        elements[size] = element;               // добавление
        size++;
    }

    public void removeFromArrList(int index) {             // метод по удалению элемента в списка
        Objects.checkIndex(index, size);
        elements[index] = null;                              // приравниваем эту ячкйку в массиве к ""
        size--;
        String[] elementsNewAfterRemove = new String[elements.length]; // создаем пустой массив для копирования данных не равныъ "" в него
        int countNewArr = 0;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i]!=null) {
                    elementsNewAfterRemove[countNewArr] = elements[i];
                    countNewArr++;                          //финальное значение "каунтера" при последней итерации цикла будет равно текущему размеру size в строке 26.
                }
            }
            elements = elementsNewAfterRemove.clone();
        }

    public void clearArrList() {                       // "очистка" списка
        for(String elemToClear : elements) {
            elemToClear = "";
            size = 0;
        }
    }

    public String getElementArrList(int index) {       //  возвращает элемент под индексом
        return elements[index];
    }

    public void printArrayList() {
        if(size == 0) {
            System.out.println("ArrayList is empty!");
        }
        for (int i = 0; i < size; i++) {
                System.out.println(elements[i]);
        }
    }
}
