package lesson05.Task_08LightsControlWithSwitch;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Переписать гирлянду используя оператор switch для  выбора нужной операции.
 */

public class LightsControlSwitchConsoleTest {
    public static void main(String[] args) {
        int i = 42948;
        String choice;
        start:
        while (true) {
            System.out.println("1 - Lights State");
            System.out.println("2 - Lights Flash");
            System.out.println("3 - Lights Run");
            System.out.println("4 - Lights On/Off");
            System.out.println("0 - Exit");
            Scanner sc = new Scanner(System.in);
            if (sc.hasNextLine()) {
                choice = sc.nextLine();
                switch (choice) {
                    case "1":
                        getLightsState(i);
                        break;
                    case "2":
                        setLightsFlashing(4, i);
                        break;
                    case "3":
                        setLightsRunning(3, i);
                        break;
                    case "4":
                        if (isTheFirstLightOn(i)) {
                            System.out.println("The first light is on");
                        } else {
                            System.out.println("The first light is off");
                        }
                        break;
                    case "0":
                        break start;
                    default:
                        System.out.println("Incorrect choice");
                }
            }
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
        return (a & 1) != 0;
    }
}
