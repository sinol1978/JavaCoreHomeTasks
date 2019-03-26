package lesson10.task04sizes;

public class Pants extends Clothing implements MensClothing, LadiesClothing {

    private boolean male;

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }

    public Pants(Sizes size, double price, String color, boolean male) {
        this.size = size;
        this.price = price;
        this.color = color;
        this.male = male;
    }

    @Override
    public void putLadiesClothing() {
        System.out.println("Pants for ladies.");
    }

    @Override
    public void putMensClothing() {
        System.out.println("Pants for men.");
    }

    @Override
    public String toString() {
        if (this.isMale()) {
            this.putMensClothing();
        } else {
            this.putLadiesClothing();
        }
        return "Color: " + this.getColor() + "   Size: " + this.getSize() +
                " (" + this.getSize().getDescription() + ")   " + this.getPrice() + "$";
    }
}
