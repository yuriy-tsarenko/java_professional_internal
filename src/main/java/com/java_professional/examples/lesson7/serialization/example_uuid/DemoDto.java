package com.java_professional.examples.lesson7.serialization.example_uuid;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DemoDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int price;
    private String model;
    private String owner;
}
