package lesson07.task05ascdescnums;

/**
 * Даны два целых числа A и В.
 * Выведите все числа от A до B включительно, в порядке возрастания, если A < B,
 * или в порядке убывания в противном случае.
 * Использовать рекурсию.
 */

public class AscDescNumbers {
    static void f(int a, int b) {
        if (a != b) {
            System.out.println(a);
            if (a < b) {
                f(a + 1, b);
            } else {
                f(a - 1, b);
            }
        }
    }

    public static void main(String[] args) {
        f(1, 5);
    }
}
