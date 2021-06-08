package com.java_proffesional.ruslan.homework.lesso7.task2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter

public class Bird implements Cloneable {
    public String name;
    public int age;
    public Group group;

    Bird() {
    }

    public Bird(String name, int age, Group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    @Override
    public Bird clone() throws CloneNotSupportedException {
        Bird clone = (Bird) super.clone();
        Group group = (Group) clone.getGroup().clone();
        clone.setGroup(group);
        return clone;
    }

}