package com.java_professional.examples.lesson7.clone.shallow.cloning;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Student implements Cloneable {
    public String name;
    public int age;
    public Group group;

    Student() {
    }

    public Student(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

}
