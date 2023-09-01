package org.eduardocd.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Customer extends BaseEntity {

    private String name;
    private String lastName;

    public Customer(String name, String lastName) {
        super();
        this.name = name;
        this.lastName = lastName;
    }

}
