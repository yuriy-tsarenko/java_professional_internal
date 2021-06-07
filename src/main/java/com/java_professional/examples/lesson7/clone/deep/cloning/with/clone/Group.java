package com.java_professional.examples.lesson7.clone.deep.cloning.with.clone;

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
