package lesson14.task08minmax;

import java.lang.reflect.Array;

/**
 * Написать обобщенный класс MinMax, который содержит методы для нахождения минимального и максимального элемента массива.
 * Массив является переменной класса. Массив должен передаваться в класс через конструктор.
 */

public class MinMax<T extends Number & Comparable> {
    private T[] array;

    public MinMax(T[] array) {
        this.array = array;
    }

    public T findMin() {
        this.sortBubble(this.array);
        return array[0];
    }

    public T findMax() {
        this.sortBubble(this.array);
        return array[array.length - 1];
    }

    private void sortBubble(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
