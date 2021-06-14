package com.java_professional.examples.lesson10.stream.paralel_stream.example4;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Employee implements Serializable {
    private String name;
    private int age;
    private BigDecimal salary;
}
