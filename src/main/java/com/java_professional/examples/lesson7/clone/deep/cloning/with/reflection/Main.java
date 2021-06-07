package com.java_professional.examples.lesson7.clone.deep.cloning.with.reflection;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        Cow originalCow = new Cow("Milka", 55, 1);
        System.out.println("Original cow = " + originalCow);

        Cow copiedCow = null;
        try {
            copiedCow = reflectionCloning(originalCow);
        } catch (NoSuchMethodException | InvocationTargetException
                | InstantiationException | IllegalAccessException e) {
            log.error(e);
        }
        System.out.println(copiedCow);
    }

    private static Cow reflectionCloning(Cow originalCow) throws NoSuchMethodException, InvocationTargetException,
            InstantiationException, IllegalAccessException {
        Cow copiedCow = Cow.class.getConstructor().newInstance();

        try {
            Field name = Cow.class.getDeclaredField("name");
            Field head = Cow.class.getDeclaredField("head");
            Field age = Cow.class.getDeclaredField("age");

            name.setAccessible(true);
            head.setAccessible(true);
            age.setAccessible(true);

            name.set(copiedCow, originalCow.getName());
            head.set(copiedCow, originalCow.getHead());
            age.set(copiedCow, originalCow.getAge());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            log.error(e);
        }
        return copiedCow;
    }
}
