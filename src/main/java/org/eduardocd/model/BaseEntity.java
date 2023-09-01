package org.eduardocd.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseEntity {
    protected Integer id;

    private static int lastId;

    public BaseEntity() {
        this.id = ++lastId;
    }
}
