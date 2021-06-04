package com.java_professional.examples.lesson6;

import com.java_professional.examples.lesson6.varargs.Convertor;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException {
        Container container = new Container(Convertor.class);
        Object instance = container.getInstance();

    }
}
