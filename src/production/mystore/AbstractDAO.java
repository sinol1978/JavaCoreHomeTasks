package production.mystore;

import java.util.List;

public abstract class AbstractDAO<K extends Number, T> {

    protected abstract List<T> findAll();

    protected abstract T findEntityById(K id);

    protected abstract boolean deleteEntityById(K id);

    protected abstract boolean deleteEntity(T entity);

    protected abstract boolean createEntity(T entity);

    public abstract T update(T entity);
}
