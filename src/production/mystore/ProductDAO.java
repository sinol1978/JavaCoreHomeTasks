package production.mystore;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static production.mystore.ConnectionData.*;

public class ProductDAO extends AbstractDAO<Integer, Product> {
    public static final String SQL_SELECT_PRODUCT = "SELECT * FROM products";
    public static final String SQL_INSERT_PRODUCT = "INSERT INTO products (name, price, rating, category_id) VALUES";
    public static final String SQL_DELETE_PRODUCT = "DELETE FROM products WHERE id=";


    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL + "?serverTimezone=Europe/Moscow&useSSL=false", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_PRODUCT)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int rating = resultSet.getInt("rating");
                int categoryId = resultSet.getInt("category_id");
                Product tempProduct = new Product(name, price, rating, categoryId);
                products.add(tempProduct);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    @Override
    public Product findEntityById(Integer id) {
        String paramId = String.format(" WHERE id=%s", id);
        try (Connection connection = DriverManager.getConnection(URL + "?serverTimezone=Europe/Moscow&useSSL=false", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_SELECT_PRODUCT + paramId)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int rating = resultSet.getInt("rating");
                int categoryId = resultSet.getInt("category_id");
                return new Product(name, price, rating, categoryId);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    protected boolean insertEntity(Product entity) {
        String paramProduct = String.format("('%s',%s,%s,%s)", entity.getName(), entity.getPrice(), entity.getRating(), entity.getCategoryId());
        try (Connection connection = DriverManager.getConnection(URL + "?serverTimezone=Europe/Moscow&useSSL=false", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_PRODUCT + paramProduct)) {
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    protected boolean deleteEntityById(Integer id) {
        try (Connection connection = DriverManager.getConnection(URL + "?serverTimezone=Europe/Moscow&useSSL=false", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_PRODUCT + id)) {
            preparedStatement.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    protected boolean deleteEntity(Product entity) {
        String paramId = String.format(" WHERE name=%s", entity.getName());

        try (Connection connection = DriverManager.getConnection(URL + "?serverTimezone=Europe/Moscow&useSSL=false", USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(SQL_DELETE_PRODUCT)) {
            preparedStatement.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }


    @Override
    public Product update(Product entity) {
        return null;
    }
}
