package lesson09.task06fruitstore;

import java.util.Arrays;

public class Cart {
    private Fruit[] fruits;

    public Cart() {
    }

    public Cart(Fruit[] fruits) {
        this.fruits = fruits;
    }

    public Fruit[] getFruits() {
        return fruits;
    }

    public void setFruits(Fruit[] fruits) {
        this.fruits = fruits;
    }

    @Override
    public String toString() {
        String cart = "Shopping cart:\n";
        if (fruits != null) {
            int i = 0;
            double total = 0.0;
            for (Fruit item : fruits) {
                cart += "\t" + (++i) + ". " + item.toString() + "\n";
                total += item.getTotalPrice();
            }
            cart += "\nTotal: " + total + "$";
        }
        cart += "\nApples: " + Apple.count + " pcs." +
                "\tPears: " + Pear.count + " pcs." +
                "\tApricots: " + Apricot.count + " pcs.";
        return cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cart cart = (Cart) o;
        return Arrays.equals(fruits, cart.fruits);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(fruits);
    }
}
