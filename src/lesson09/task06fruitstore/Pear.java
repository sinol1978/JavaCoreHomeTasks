package lesson09.task06fruitstore;

import java.util.Objects;

public class Pear extends Fruit {
    private double price;
    public static int count = 0;

    public Pear(double weight, double price) {
        super(weight);
        this.price = price;
        count++;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    protected double getTotalPrice() {
        return this.weight * this.price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pear Pear = (Pear) o;
        return Double.compare(Pear.price, price) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price);
    }

    @Override
    public String toString() {
        return "Pear\t" + weight + "g * " + price + "$ = " + getTotalPrice() + "$";
    }

}
