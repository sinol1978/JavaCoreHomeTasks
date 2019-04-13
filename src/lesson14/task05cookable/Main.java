package lesson14.task05cookable;

/**
 * ������� ��������� Cookable, ���������� ����� void cook().
 * ������� ����� Food, ���������� ����� public void prepare(Cookable c) { c.cook(); }
 * ������� ��������� ������ Food � ������� ��� ����� prepare().
 * �� ���� ������ prepare() �������� ��������� ���������� ������, ������������ ��������� Cookable.
 */

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking food");
            }
        });
    }
}
