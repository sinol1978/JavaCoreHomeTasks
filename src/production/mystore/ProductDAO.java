package production.mystore;

import java.util.List;

public class ProductDAO extends AbstractDAO<Integer, Product> {
    public static final String SQL_SELECT_PRODUCT = "SELECT * FROM products";
    public static final String SQL_INSERT_PRODUCT = "INSERT INTO products ('name', 'price', 'rating', 'category_id') VALUES";
    public static final String SQL_DELETE_PRODUCT = "";


    @Override
    protected List<Product> findAll() {
        return null;
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
        return false;
    }

    @Override
    public Product update(Product entity) {
        return null;
    }
}
