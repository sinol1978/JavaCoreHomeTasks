package lesson09.task06fruitstore;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[]{
                new Apple(0.10, 1.50),
                new Apple(0.10, 1.50),
                new Pear(0.15, 1.50),
                new Pear(0.15, 1.65),
                new Apricot(0.30, 2.05),
                new Apricot(0.30, 2.05),
                new Apple(0.10, 1.50)
        };
        Cart cart = new Cart(fruits);
        System.out.println(cart.toString());
    }
}
