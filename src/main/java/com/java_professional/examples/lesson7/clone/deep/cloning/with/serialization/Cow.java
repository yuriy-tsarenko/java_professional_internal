package com.java_professional.examples.lesson7.clone.deep.cloning.with.serialization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude = "age")
public class Cow implements Serializable {
    private String name;
    private int weight;
    private int age;
}
