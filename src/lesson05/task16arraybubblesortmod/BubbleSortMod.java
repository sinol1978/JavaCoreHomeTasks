package lesson05.task16arraybubblesortmod;

import java.util.Arrays;

/**
 * Изменить программу сортировки пузырьком:
 * а) добавить возможность досрочного окончания сортировки;
 * б) программа написана таким образом, что минимальный элемент "всплывает" в начало массива.
 * Измените программу так чтобы минимальный элемент "всплывал" в конец массива
 * (внутренний цикл for должен перебирать элементы не с конца, а с начала).
 */

public class BubbleSortMod {
    public static void main(String[] args) {
        int[] array = {3, 2, 4, 5, 6, 1};
        System.out.println("The original array:");
        System.out.println(Arrays.toString(array));
        sortBubble(array);
        System.out.println("The array sorted by Bubble sort:");
        System.out.println(Arrays.toString(array));
        sortAnchor(array);
        System.out.println("The array sorted by Anchor sort:");
        System.out.println(Arrays.toString(array));
    }

    private static void sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1 - i; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    private static void sortAnchor(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
    }
}
