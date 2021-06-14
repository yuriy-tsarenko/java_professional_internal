package com.java_professional.examples.lesson10.simple.optional.demo;

import java.util.Optional;

public class OptionalDemo {

    private static final CustomerRepository repository = new CustomerRepository();

    public static void main(String[] args) {
        boolean result = changePassword("secretPass", 16L);
        if (result) {
            System.out.println("SUCCESS");
        } else {
            System.out.println("PASSWORD UPDATE PROCESS FAILED");
        }
    }

    public static boolean changePassword(String password, Long id) {
        Customer byId = repository.getCustomerById(id);
        if (isNonNull(byId)) {
            byId.setPassword(password);
            repository.updatePassword(repository.getCustomerById(id), byId);
            return true;
        }
        return false;
    }

    public static boolean isNonNull(Object object) {
        return Optional.ofNullable(object).isPresent();
    }
}
