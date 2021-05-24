package com.java_professional.examples.lesson1;

import java.util.Arrays;
import java.util.Comparator;


public class SimpleComparableStudent implements Comparable<SimpleComparableStudent> {
    private String firstName;
    private int group;

    public SimpleComparableStudent(String firstName, int group) {
        this.firstName = firstName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public String toString() {
        return firstName + " " + group;
    }

    @Override
    public int compareTo(SimpleComparableStudent student) {
        if (this.group > student.group) {
            return 1;
        } else if (this.group < student.group) {
            return -1;
        } else {
            return 0;
        }
    }

//    @Override
//    public int compareTo(Object o) {
//        if (this.group > ((SimpleComparableStudent)o).group) {
//            return 1;
//        } else if (this.group < ((SimpleComparableStudent)o).group) {
//            return -1;
//        } else {
//            return 0;
//        }
//    }
}

class SimpleComparatorStudent implements Comparator<SimpleComparableStudent> {
    @Override
    public int compare(SimpleComparableStudent o1, SimpleComparableStudent o2) {
        String firstName1 = o1.getFirstName();
        String firstName2 = o2.getFirstName();
        return firstName1.compareTo(firstName2);
    }
}

class Main {
    public static void main(String[] args) {
        SimpleComparableStudent[] myStudents = {new SimpleComparableStudent("Yevhenii", 333),
                new SimpleComparableStudent("Andrew", 222),
                new SimpleComparableStudent("Igor", 111),
                new SimpleComparableStudent("Peter", 300),
        };
        Arrays.sort(myStudents, new SimpleComparatorStudent());

        for (SimpleComparableStudent myStudent : myStudents) {
            System.out.println(myStudent);
        }
    }
}
