package org.eduardocd.repository;

import org.eduardocd.model.Customer;

import java.util.List;

public interface PageableRepository<T> {

    List<T> paginate(int start, int end);

}
