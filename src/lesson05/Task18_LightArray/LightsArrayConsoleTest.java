package lesson05.Task18_LightArray;

import java.util.Scanner;

/**
 * Реализовать задачу с гирляндой используя массивы.
 * Для реализации бегущей строки используйте метод System.arraycopy(...);
 */

public class LightsArrayConsoleTest {
    public static void main(String[] args) {
        int[] lights = {1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0};

        start:
        while (true) {
            System.out.println("1 - Lights State");
            System.out.println("2 - Lights Flash");
            System.out.println("3 - Lights Run");
            System.out.println("4 - Lights On/Off");
            System.out.println("0 - Exit");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                String choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        getLightsState(lights);
                        break;
                    case "2":
                        for (int i = 0; i < 5; i++) {
                            setLightsFlashing(lights);
                            getLightsState(lights);
                            System.out.println();
                        }
                        break;
                    case "3":
                        //setLightsRunning(light);
                        break;
                    case "0":
                        break start;
                    default:
                        System.out.println("Incorrect choice");
                }
            }

        }
    }

    private static void getLightsState(int[] array) {
        for (int i : array) {
            System.out.print(i);
        }
    }

    private static void setLightsFlashing(int[] array) {
        for (int i : array) {
            if (i > 0) {
                i = 0;
            } else {
                i = 1;
            }
            System.out.print(i);
        }
        System.out.println();
    }
}
