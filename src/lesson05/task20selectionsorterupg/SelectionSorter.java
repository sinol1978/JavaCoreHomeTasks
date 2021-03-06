package lesson05.task20selectionsorterupg;

import java.util.Arrays;

public class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[]{1, 3, 4, -3, -11, 0, 55};
        System.out.println(Arrays.toString(ar));
        sort(ar);
        System.out.println(Arrays.toString(ar));
    }
}
