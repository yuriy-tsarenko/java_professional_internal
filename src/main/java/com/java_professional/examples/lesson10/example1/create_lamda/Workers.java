package com.java_professional.examples.lesson10.example1.create_lamda;

public class Workers<T> {

    private final T[] value;

    public Workers(T[] value) {
        this.value = value;
    }

    public void someWork(CustomConsumer<T> consumer) {
        for (T type : value) {
            consumer.action(type);
        }
    }
}
