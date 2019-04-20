package lesson07.task05ascdescnums;

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
