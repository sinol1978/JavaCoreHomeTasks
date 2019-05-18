package production.mystore;

public class JDBCTests {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        productDAO.findAll().forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
        Product testProduct = new Product("testProduct", 0.0, 0, 2);
        System.out.println(productDAO.insertEntity(testProduct));
        testProduct.setPrice(testProduct.getPrice() + 1.11);
        System.out.println(productDAO.update(testProduct));
        System.out.println("---------------------------------------------------------");

        productDAO.findAll().forEach(System.out::println);
        System.out.println("---------------------------------------------------------");

        System.out.println(productDAO.deleteEntity(testProduct));
        productDAO.findAll().forEach(System.out::println);
    }
}
