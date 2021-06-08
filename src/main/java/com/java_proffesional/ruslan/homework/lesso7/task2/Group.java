package com.java_proffesional.ruslan.homework.lesso7.task2;

import lombok.ToString;

@ToString
public class Group implements Cloneable {
    public int id;

    public Group(int id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}