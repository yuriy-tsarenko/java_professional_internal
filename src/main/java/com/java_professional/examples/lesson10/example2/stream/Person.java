package com.java_professional.examples.lesson10.example2.stream;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@ToString
public class Person {

    private String name;
    private int age;
    private boolean hasAccess;

}
