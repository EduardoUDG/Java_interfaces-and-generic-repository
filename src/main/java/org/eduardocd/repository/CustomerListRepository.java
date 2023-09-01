package org.eduardocd.repository;

import org.eduardocd.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerListRepository extends AbstractListRepository<Customer> {

    @Override
    public Customer update(Customer customer) {
        Customer c = this.getById(customer.getId());
        c.setName(customer.getName());
        c.setLastName(customer.getLastName());
        return c;
    }

    @Override
    public void deleteById(Integer id) {
        Customer c = this.getById(id);
        this.dataSource.remove(c);
    }

    @Override
    public List<Customer> sort(String attribute, Direction direction) {
        List<Customer> listOrdered = new ArrayList<>(this.dataSource);
        listOrdered.sort((a, b) -> {
            int result = 0;
            if (direction == Direction.ASC) {
                result = reorder(attribute, a, b);
            } else if (direction == Direction.DES) {
                result = reorder(attribute, b, a);
            }
            return result;
        });
        return listOrdered;
    }

    public static int reorder(String attribute, Customer a, Customer b) {
        int result = 0;
        switch (attribute) {
            case "id" : result = a.getId().compareTo(b.getId()); break;
            case "name" : result = a.getName().compareTo(b.getName()); break;
            case "lastName" : result = a.getLastName().compareTo(b.getLastName()); break;
        }
        return result;
    }
}
