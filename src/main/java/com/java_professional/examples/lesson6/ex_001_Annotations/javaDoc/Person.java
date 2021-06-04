package com.java_professional.examples.lesson6.ex_001_Annotations.javaDoc;

/**
 * @author Yuriy Tsarenko
 */
public class Person {
    /**
     * person's name
     */
    private String name;

    /**
     * This constructor initializes a Person object.
     *
     * @param name an initial person name
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     * Method call sets a name of a person
     *
     * @param name a new person name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method call gets the person's name
     *
     * @return person's name
     */
    public String getName() {
        return name;
    }

    /**
     * Method call shows the person's name
     *
     * @return person's name
     */
    public String show() {
        return "show: " + name;
    }

    /**
     * Method call returns custom string
     *
     * @return I am a person
     */
    public String talk() {
        return "I'm a person";
    }
}

class Student extends Person {
    /**
     * student's age
     */
    private int age;

    /**
     * This constructor initializes a Student object.
     *
     * @param name student's name
     * @param age  student's age
     */
    public Student(String name, int age) {
        super(name);
        this.age = age;
    }
}
