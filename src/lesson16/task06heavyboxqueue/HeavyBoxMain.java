package lesson16.task06heavyboxqueue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Создать очередь, содержащую объекты класса HeavyBox. Используем класс ArrayDeque.
 * Поместить объекты в очередь с помощью метода offer(). Удалить объекты методом poll().
 */

public class HeavyBoxMain {
    public static void main(String[] args) {
        HeavyBox heavyBox1 = new HeavyBox(10, 20, 30, 400);
        HeavyBox heavyBox2 = new HeavyBox(20, 20, 30, 400);
        HeavyBox heavyBox3 = new HeavyBox(30, 20, 30, 400);
        HeavyBox heavyBox4 = new HeavyBox(40, 20, 30, 400);
        HeavyBox heavyBox5 = new HeavyBox(50, 20, 30, 400);
        HeavyBox heavyBox6 = new HeavyBox(60, 20, 30, 400);
        Queue<HeavyBox> heavyBoxes = new ArrayDeque<>();
        heavyBoxes.offer(heavyBox1);
        heavyBoxes.offer(heavyBox2);
        heavyBoxes.offer(heavyBox3);
        heavyBoxes.offer(heavyBox4);
        heavyBoxes.offer(heavyBox5);
        heavyBoxes.offer(heavyBox6);
        heavyBoxes.forEach(System.out::println);
        heavyBoxes.poll();
        System.out.println();
        heavyBoxes.forEach(System.out::println);
    }
}
