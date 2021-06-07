package com.java_professional.examples.lesson7.clone.deep.cloning.with.clone;

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
        Student clone = (Student) super.clone();
        Group group = (Group) clone.getGroup().clone();
        clone.setGroup(group);
        return clone;
    }

}
