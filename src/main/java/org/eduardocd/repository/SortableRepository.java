package org.eduardocd.repository;

import org.eduardocd.model.Customer;

import java.util.List;

public interface SortableRepository<T> {

    List<T> sort(String attribute, Direction  direction);

}
