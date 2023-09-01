package org.eduardocd.repository;

import org.eduardocd.model.BaseEntity;
import org.eduardocd.model.Customer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements SortablePageableCrudRepository<T> {

    protected List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> getAll() {
        return this.dataSource;
    }

    @Override
    public T getById(Integer id) {
        T c = null;
        for (T customer : this.dataSource) {
            if (customer.getId() != null && customer.getId().equals(id)) {
                c = customer;
                break; // Nos salimos del for
            }
        }
        return c;
    }

    @Override
    public T save(T t) {
        this.dataSource.add(t);
        return t;
    }

    @Override
    public List<T> paginate(int start, int end) {
        return this.dataSource.subList(start, end);
    }

}
