package com.java_professional.examples.lesson3.string_builder;

public class DemoBuilder {
    public static void main(String[] args) {
        String text = "Some Text";
        StringBuilder builder = new StringBuilder(text);
        builder.append(" Other text");
        System.out.println(builder);

        builder.insert(1, "INSERTED");
        System.out.println(builder);

        builder.delete(0, 5);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);

        builder.replace(5, 7, "REPLACE");
        System.out.println(builder);

        int capacity = builder.capacity();
        System.out.println("size: " + capacity);

        int length = builder.length();
        System.out.println("number of elements: " + length);

        String substring = builder.substring(3, length - 1);
        System.out.println("substring: " + substring);

        System.out.println(builder);
    }
}
