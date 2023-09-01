package org.eduardocd.repository;

public interface SortablePageableCrudRepository<T> extends  PageableRepository<T>,
                                                            SortableRepository<T>,
                                                            CrudRepository<T> {
}
