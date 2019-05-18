package production.mystore;

import java.util.List;

public class JDBCTests {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.findAll();
        products.forEach(System.out::println);
    }
}
