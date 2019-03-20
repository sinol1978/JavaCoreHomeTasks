package lesson09.testpackage2;

import lesson09.testpackage.TestClassA;

public class TestClassE extends TestClassA {
    @Override
    public void C() {
        super.C();
    }

    @Override
    protected void D() {
        super.D();
    }

    public static void main(String[] args) {
        TestClassA test1 = new TestClassE();

        test1.C();


    }


}
