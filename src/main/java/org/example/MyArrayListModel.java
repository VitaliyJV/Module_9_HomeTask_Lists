package org.example;
import java.util.Arrays;

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

    public void add(String element) {           // метод по добавлению элемента в список
        if (size == capacity) {                 // проверка, заполнили ли мы список(массив "под капотом" точнее)
            grow();
        }
        elements[size] = element;               // добавление
        size++;
    }

    public void remove(String element) {        // метод по удалению элемента в списка
        for (String arrElem : elements) {       // ищем заданый элемент для удаления
            if (arrElem.equalsIgnoreCase(element)) {
                arrElem = "";                   // приравниваем эту ячкйку в массиве к ""
                size--;                         // уменьшаем счетчик количества элементов массива
                break;                          // выходим из цикла
            }
        }
        String[] elementsNewAfterRemove = new String[elements.length]; // создаем пустой массив для копирования данных не равныъ "" в него
        int countNewArr = 0;
        for (int i = 0; i < elements.length; i++) {
            if (!elements[i].equalsIgnoreCase("")) {
                    elementsNewAfterRemove[countNewArr] = elements[i];
                    countNewArr++;              //финальное значение "каунтера" при последней итерации цикла будет равно текущему размеру size в строке 26.
                }
            }
            elements = elementsNewAfterRemove.clone();
        }

    public void clear() {                       // "очистка" списка
        for(String elemToClear : elements) {
            elemToClear = "";
            size = 0;
        }
    }

    public String getElement(int index) {       //  возвращает элемент под индексом
        return elements[index];
    }
}
