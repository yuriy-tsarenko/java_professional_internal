package com.java_professional.examples.lesson6;

import java.lang.reflect.InvocationTargetException;

public class Container {

    private final Class<?> clazz;

    public Container(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Object getInstance() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return clazz.getConstructor().newInstance();
    }
}
