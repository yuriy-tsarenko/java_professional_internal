package com.java_professional.examples.lesson10.example1.lambdaExpression;

public class Radio implements ElectricityConsumer {

    private void playMusic() {
        System.out.println("Radio plays");
    }

    public void electricityOn(Object sender) {
        playMusic();
    }
}
