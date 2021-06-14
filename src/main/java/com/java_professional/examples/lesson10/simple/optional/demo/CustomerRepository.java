package com.java_professional.examples.lesson10.simple.optional.demo;

import java.util.LinkedList;
import java.util.List;

public class CustomerRepository {

    private final List<Customer> customers = new LinkedList<>();

    public Customer getCustomerById(Long id) {
        return customers.stream()
                .filter(element -> element.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Customer updatePassword(Customer src, Customer target) {
        int index = customers.indexOf(src);
        return customers.set(index, target);
    }

    {
        customers.add(new Customer(1L, "David1", "user123", "12345"));
        customers.add(new Customer(2L, "David2", "user123", "12345"));
        customers.add(new Customer(3L, "David3", "user123", "12345"));
        customers.add(new Customer(4L, "David4", "user123", "12345"));
        customers.add(new Customer(5L, "David5", "user123", "12345"));
        customers.add(new Customer(6L, "David6", "user123", "12345"));
        customers.add(new Customer(7L, "David7", "user123", "12345"));
        customers.add(new Customer(8L, "David8", "user123", "12345"));
        customers.add(new Customer(9L, "David9", "user123", "12345"));
        customers.add(new Customer(10L, "David10", "user123", "12345"));
        customers.add(new Customer(11L, "David11", "user123", "12345"));
        customers.add(new Customer(12L, "David12", "user123", "12345"));
        customers.add(new Customer(13L, "David13", "user123", "12345"));
        customers.add(new Customer(14L, "David14", "user123", "12345"));
        customers.add(new Customer(15L, "David15", "user123", "12345"));
        customers.add(new Customer(16L, "David16", "user123", "12345"));
    }
}
