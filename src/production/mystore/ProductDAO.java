package production.mystore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static production.mystore.ConnectionData.*;

public class ProductDAO extends AbstractDAO<Integer, Product> {
    public static final String SQL_SELECT_PRODUCT = "SELECT * FROM products";
    public static final String SQL_INSERT_PRODUCT = "INSERT INTO products ('name', 'price', 'rating', 'category_id') VALUES";
    public static final String SQL_DELETE_PRODUCT = "";


    @Override
    protected List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_PRODUCT)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                products.add((Product) resultSet);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    @Override
    protected Product findEntityById(Integer id) {
        return null;
    }

    @Override
    protected boolean deleteEntityById(Integer id) {
        return false;
    }

    @Override
    protected boolean deleteEntity(Product entity) {
        return false;
    }

    @Override
    protected boolean createEntity(Product entity) {
        String insertParams = String.format("(%s,%s,%s,%s)", entity.getName());
        return false;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }
}
