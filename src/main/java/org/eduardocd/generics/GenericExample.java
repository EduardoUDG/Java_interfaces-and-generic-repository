package org.eduardocd.generics;

import org.eduardocd.model.Customer;
import org.eduardocd.model.PremiumCustomer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class GenericExample {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        customers.add(new Customer("Eduardo", "Dorado"));
        Customer currentCustomer = customers.get(0);

        Customer[] customerArray = {
            new Customer("Memo", "Perez"),
            new Customer("Javier", "Chavez")
        };
        List<Customer> customersList = arrayToList(customerArray);

        Integer[] integers = {1, 2, 3};

        List<PremiumCustomer> premiumCustomers = arrayToList(new PremiumCustomer[]{
            new PremiumCustomer("Lalo", "Dorado")
        });
        printCustomers( premiumCustomers );
        System.out.println("Maximo de 1, 9 y 4 es: " + maximo(1,9,4));
        System.out.println("Maximo de zanahoria, arandano y manzana es: " + maximo("zanahoria","arandano","manzana"));
    }

    public static <T> List<T> arrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Customer & Comparable<T>> List<T> arrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> arrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static void printCustomers(List<? extends Customer> customers) {
        customers.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c) {
        T max = a;
        if(b.compareTo(max) > 0) {
            max = b;
        }
        if(c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

}
