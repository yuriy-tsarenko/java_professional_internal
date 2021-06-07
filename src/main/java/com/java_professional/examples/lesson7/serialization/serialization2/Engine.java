package com.java_professional.examples.lesson7.serialization.serialization2;

import lombok.ToString;

import java.io.Serializable;

@ToString
public class Engine implements Serializable {
    private int power;

    Engine() {
    }

    Engine(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
