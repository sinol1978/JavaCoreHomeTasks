package lesson08.task04flowers;

public class Main {
    public static void main(String[] args) {
        Flower rose1 = new Rose("Amsterdam", 5, 0.77);
        Flower rose2 = new Rose("Amsterdam", 5, 0.77);
        Flower rose3 = new Rose("Amsterdam", 5, 0.77);
        Flower rose4 = new Rose("Amsterdam", 5, 0.77);

        Flower tulip1 = new Tulip("Eindhoven", 3, 0.25);
        Flower tulip2 = new Tulip("Eindhoven", 3, 0.25);
        Flower tulip3 = new Tulip("Eindhoven", 3, 0.25);

        Flower sf1 = new Sunflower("Kharkiv", 6, 0.05);
        Flower sf2 = new Sunflower("Kharkiv", 6, 0.05);

        Order order1 = new Order(new Flower[]{rose1, rose2, rose3, rose4});
        order1.printOrder();

        Order order2 = new Order(new Flower[]{tulip1, sf2, tulip2, rose3, tulip3, sf1});
        order2.printOrder();

        Order order3 = new Order(new Flower[]{rose1, tulip1, sf2, rose2, tulip2, rose3, tulip3, sf1, rose4, tulip1});
        order2.printOrder();

        System.out.println("\nSold flowers:");
        System.out.println("Roses: " + Rose.getRoseCount() + " pcs.");
        System.out.println("Tulips: " + Tulip.getTulipCount() + " pcs.");
        System.out.println("Sunflowers: " + Sunflower.getSunflowerCount() + " pcs.");
    }
}
