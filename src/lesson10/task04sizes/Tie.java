package lesson10.task04sizes;

public class Tie extends Clothing implements MensClothing {

    public Tie(Sizes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void putMensClothing() {
        System.out.println("Tie for men.");
    }

    @Override
    public String toString() {
        this.putMensClothing();
        return "Color: " + this.getColor() + "   Size: " + this.getSize() +
                " (" + this.getSize().getDescription() + ")   " + this.getPrice() + "$";
    }
}
