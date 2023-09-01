package org.eduardocd.repository;

import java.util.List;

public interface CrudRepository<T> {

    List<T> getAll();
    T getById(Integer id);
    T save(T customer);
    T update(T customer);
    void deleteById(Integer id);

}
