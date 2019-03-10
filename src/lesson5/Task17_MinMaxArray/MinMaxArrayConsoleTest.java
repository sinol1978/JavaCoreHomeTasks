package lesson5.Task17_MinMaxArray;

import java.util.Arrays;
import java.util.Random;

/**
 * Создать двухмерный массив 5х8 и инициализировать его с помощью блока для инициализации.
 * Найти максимальное и минимальное значение в каждой "строке" и записать эти значения в двухмерный массив 5х2.
 * Распечатать оба массива.
 */

public class MinMaxArrayConsoleTest {
    public static void main(String[] args) {
        int[][] array = {
                {getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100)},
                {getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100),},
                {getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100),},
                {getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100),},
                {getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100), getRandom(0, 100),},
        };
        int[][] arrayMinMax = new int[5][2];
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            arrayMinMax[i] = getArrayMinMax(array[i]);
        }
        System.out.println(Arrays.deepToString(arrayMinMax));
    }

    private static int getRandom(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    private static void sortBubble(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    private static int[] getArrayMinMax(int[] ar) {
        sortBubble(ar);
        int[] tempArray = new int[2];
        tempArray[0] = ar[0];
        tempArray[1] = ar[ar.length - 1];
        return tempArray;
    }
}
