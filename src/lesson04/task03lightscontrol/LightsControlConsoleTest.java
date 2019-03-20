package lesson04.task03lightscontrol;

import java.math.BigInteger;

/**
 * Имеется гирлянда, состоящая из 32 лампочек.
 * Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены.
 * Напишите следующие методы:
 * a) метод который будет мигать лампочками гирлянды заданное количество раз (операция ~);
 * б) метод, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * в) метод, который будет выяснять включена ли лампочки на первой позиции (наложение маски с помощью &);
 * г) метод который будет распечатывать текущее состояние гирлянды.
 * Используйте побитовые операции. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a)
 */

public class LightsControlConsoleTest {
    public static void main(String[] args) {
        int i = 42949;
        getLightsState(i);
        System.out.println();
        setLightsFlashing(4, i);
        System.out.println();
        setLightsRunning(5, i);
        System.out.println();
        if (isTheFirstLightOn(i)) {
            System.out.println("The first light is on");
        } else {
            System.out.println("The first light is off");
        }
    }

    private static void setLightsFlashing(int a, int b) {
        for (int i = 0; i < a; i++) {
            b = ~b;
            String str = Integer.toBinaryString(b);
            System.out.println(String.format("%32s", new BigInteger(str)));
        }
    }

    private static void setLightsRunning(int a, int b) {
        for (int i = 0; i < a; i++) {
            b = b << 1;
            String str = Integer.toBinaryString(b);
            System.out.println(String.format("%32s", new BigInteger(str)));
        }
    }

    private static void getLightsState(int a) {
        String str = Integer.toBinaryString(a);
        System.out.println(String.format("%32s", new BigInteger(str)));
    }

    private static boolean isTheFirstLightOn(int a) {
        if ((a & 1) != 0) return true;
        else return false;
    }
}