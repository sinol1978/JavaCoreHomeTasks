package lesson07.Task05;

/**
 * Даны два целых числа A и В.
 * Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
 * или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */

public class AscDescNumbers {
    static boolean f(int a, int b) {
        if (a != b) {
            System.out.println(a + " " + f((a + (a < b ? 1 : -1)), b));
        }
        return true;
    }

    public static void main(String[] args) {
        f(1, 5);
    }
}
