package com.java_professional.examples.lesson5.reflection;


import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class SimpleReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1. getClass()
//        SimpleReflection simpleReflection = new SimpleReflection();
//        Class<?> cl = simpleReflection.getClass();
//
//        int[] arr = new int[10];
////        Class<?> cl2 = arr.getClass();
////        Class<?> cl3 = "world".getClass();
////        Class<?> cl4 = Integer.valueOf(5).getClass();
////        System.out.println(cl);
////        System.out.println(cl2);
////        System.out.println(cl3);
////        System.out.println(cl4);

        // 2. String.class
//        Class<?> cl = SimpleReflection.class;
//        Class<?> cl2 = int[].class;
//        System.out.println(cl.getName());
//        System.out.println(cl2.getName());
        // 3. Class.forName()
//        Class<?> cl = Class.forName("java.lang.String");
//        System.out.println(cl);
//
//        int[] arr = new int[10];
//        double[] arr2 = new double[10];
//
//        Class<?> cl2 = Class.forName(arr.getClass().getName());
//        Class<?> cl3 = Class.forName(arr2.getClass().getName());
//
//        System.out.println(cl2);
//        System.out.println(cl3);

        // 4.
        Class<?> cl = Integer.class.getSuperclass();
        System.out.println(cl);

        Class<?> cl2 = Map.Entry.class.getEnclosingClass();
        System.out.println(cl2);
    }
}
