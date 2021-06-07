package com.java_professional.examples.lesson7.clone.deep.cloning.with.staticmethod;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Setter
@Getter
public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static Human cloneHuman(Human other) {
        Human human = new Human();
        human.setAge(other.getAge());
        human.setName(other.getName());
        return human;
    }
}
