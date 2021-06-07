package com.java_professional.examples.lesson7.clone.deep.cloning.with.clone;

public class ShallowCloning {
    public static void main(String[] args) {
        Group group = new Group(1);
        Student student = new Student("John", 25, group);

        try {
            Student cloneStudent = (Student) student.clone();
            System.out.println(student);
            System.out.println(cloneStudent);

            cloneStudent.name = "Robert";
            cloneStudent.group.id = 10;

            System.out.println("After cloning");

            System.out.println(student);
            System.out.println(cloneStudent);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
