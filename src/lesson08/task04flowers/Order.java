package lesson08.task04flowers;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {

    private Flower[] flowers;
    private LocalDateTime orderDate;

    public Order(Flower[] flowers) {
        this.flowers = flowers;
        orderDate = LocalDateTime.now();
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void printOrder() {
        System.out.println("Order from " + this.getOrderDate().getHour() + ":" + this.getOrderDate().getMinute() + ":" + this.getOrderDate().getSecond());
        int i = 0;
        double total = 0;
        for (Flower item : flowers) {
            System.out.print("\t" + ++i + ". ");
            item.printFlowerInfo();
            total += item.getPrice();
        }
        System.out.println("Total: " + total + "$");
    }
}
