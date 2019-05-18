package production.mystore;

import java.util.List;

public class JDBCTests {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        List<Product> products = productDAO.findAll();
        products.forEach(System.out::println);

        for (int i = 1; i <= products.size(); i++) {
            System.out.println(productDAO.findEntityById(i));
        }

        Product testProduct = new Product("testProduct", 0.0, 0, 2);
        //System.out.println(productDAO.insertEntity(testProduct));
        System.out.println(productDAO.deleteEntity(testProduct));
    }
}
