package lesson10.task04sizes;

public class Skirt extends Clothing implements LadiesClothing {

    public Skirt(Sizes size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public void putLadiesClothing() {
        System.out.println("Skirt for ladies.");
    }

    @Override
    public String toString() {
        this.putLadiesClothing();
        return "Color: " + this.getColor() + "   Size: " + this.getSize() +
                " (" + this.getSize().getDescription() + ")   " + this.getPrice() + "$";
    }
}
