package lesson14.task05cookable;

import java.util.function.Consumer;

/**
 * —оздать интерфейс Cookable, содержащий метод void cook().
 * —оздать класс Food, содержащий метод public void prepare(Cookable c) { c.cook(); }
 * —оздать экземпл€р класса Food и вызвать его метод prepare().
 * Ќа вход метода prepare() передать экземпл€р анонимного класса, расшир€ющего интерфейс Cookable.
 */

public class Main {
    public static void main(String[] args) {
        Food food = new Food();
//        food.prepare(new Cookable() {
//            @Override
//            public void cook() {
//                System.out.println("Cooking food");
//            }
//        });

        Consumer<Food> cons1 = f -> f.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Cooking food");
            }
        });
        cons1.accept(new Food());

        Consumer<Food> cons2 = f -> f.prepare(() -> {
            System.out.println("Cooking Food Again");
        });
        cons2.accept(new Food());
    }
}
