package production.mystore;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

public class ShoppingCart implements Serializable {
    private List<Product> productsInCart;
    private LocalDateTime date;
    private transient ResourceBundle rb;

    public ShoppingCart() {
        this.productsInCart = new ArrayList<>();
        date = LocalDateTime.now();
        rb = ResourceBundle.getBundle("cart", new Locale("en", "EN"));
    }

    public List<Product> getProductsInCart() {
        return productsInCart;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public boolean addProductToCart(Product product) {
        try {
            this.productsInCart.add(product);
            System.out.println(String.format("Product %s was added in your cart", product));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void printProductsInCart() {

        if (!productsInCart.isEmpty()) {
            int i = 0;
            System.out.println(String.format("%-1s %-20s%10s%11s", rb.getString("number"), rb.getString("name"), rb.getString("price"), rb.getString("rating")));
            System.out.println("---------------------------------------------");
            for (Product item : productsInCart) {
                System.out.println(String.format("%-1s. %s", ++i, item));
            }
            System.out.println("---------------------------------------------");
        } else {
            System.out.println("Shopping cart is empty.");
        }
    }

    public void clearCart() {
        productsInCart.clear();
    }

    public void saveCart() {
        if (!productsInCart.isEmpty()) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/production/mystore/shopping cart.txt"))) {
                bufferedWriter.write(getDate().getDayOfMonth() + " - " + getDate().getMonth() + " - " + getDate().getYear());
                bufferedWriter.newLine();
                double total = 0.0;
                for (Product item : productsInCart) {
                    total += item.getPrice();
                }
                int i = 0;
                bufferedWriter.write(String.format("%-1s %-20s%10s%11s", rb.getString("number"), rb.getString("name"), rb.getString("price"), rb.getString("rating")));
                bufferedWriter.newLine();
                bufferedWriter.write("-----------------------------------------------------------------------------");
                bufferedWriter.newLine();
                for (Product item : productsInCart) {
                    bufferedWriter.write(String.format("%-1s. %s", ++i, item));
                    bufferedWriter.newLine();
                }
                bufferedWriter.write("-----------------------------------------------------------------------------");
                bufferedWriter.newLine();
                bufferedWriter.write(String.format("%s: %s %s.\t%s: %7.2f$", rb.getString("scart"), this.productsInCart.size(), rb.getString("pcs"), rb.getString("total"), total));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Shopping cart is empty.");
        }
    }

    @Override
    public String toString() {
        System.out.println(getDate().getDayOfMonth() + " - " + getDate().getMonth() + " - " + getDate().getYear());
        double total = 0.0;
        for (Product item : productsInCart) {
            total += item.getPrice();
        }
        printProductsInCart();
        return String.format("%s: %s %s.\t%s: %7.2f$", rb.getString("scart"), this.productsInCart.size(), rb.getString("pcs"), rb.getString("total"), total);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(productsInCart, that.productsInCart) &&
                Objects.equals(date, that.date) &&
                Objects.equals(rb, that.rb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productsInCart, date, rb);
    }
}
