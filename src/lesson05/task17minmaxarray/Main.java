package lesson05.task17minmaxarray;

import lesson14.task08minmax.MinMax;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 5, 0};
        MinMax<Integer> mm = new MinMax(array);
        System.out.println(mm.findMax());
        System.out.println(mm.findMin());
    }
}
