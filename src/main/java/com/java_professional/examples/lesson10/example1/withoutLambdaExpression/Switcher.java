package com.java_professional.examples.lesson10.example1.withoutLambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    private final List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Выключатель включен");
        for (ElectricityConsumer c : listeners) {
            c.electricityOn(this);
            // this, вызывает объект самого себя, в зависимости от того, кто обращается
            // к switchOn
        }
    }
}
