package lesson09.testpackage;

import lesson09.testpackage.TestClassA;

public class TestClassC {

    public static void main(String[] args) {
        TestClassA test1 = new TestClassA();
        test1.B();
        test1.C();
        test1.D();

        TestClassB test2 = new TestClassB();
        test2.B();
        test2.C();
        test2.D();
    }


}
