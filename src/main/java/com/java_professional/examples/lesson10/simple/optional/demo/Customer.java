package com.java_professional.examples.lesson10.simple.optional.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Customer {

    private Long id;
    private String name;
    private String username;
    private String password;
}
