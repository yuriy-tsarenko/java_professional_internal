package com.java_professional.examples.lesson6.ex_001_Annotations.methods;

// К классу Dog добавится полная информация об аннотации @Mammal в JavaDoc

@Mammal(color = Color.GREY, sound = "Woof")
public class Dog {
    @HasHair(length = 15)
    public void hair() {

    }
}
