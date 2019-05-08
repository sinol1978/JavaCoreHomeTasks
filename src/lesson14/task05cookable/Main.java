package lesson14.task05cookable;

import java.util.function.Consumer;


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
