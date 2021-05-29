package com.java_professional.examples.lesson4.regex_data.regex.ex_001_String.string_while;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder javaBuilder = new StringBuilder();
        StringBuilder wordBuilder = new StringBuilder();
        List<Integer> integers = new ArrayList<>();
        String str = "For the time being, Java Guardians sees the situation as status quo. "
                + "\"If after all this we see"
                + "no real activity or details after JavaOne, it will be very worrisome indeed,\" "
                + "Rahman said. An online petition has been posted by Java EE Guardians urging "
                + "Oracle to move forward with EE or "
                + "turn the work over to others. As of Tuesday, the petition had more than 3 200 signatures. "
                + "Java EE Guardians has pondered developing enterprise-level Java improvements on its own.";
        Scanner scanner = new Scanner(str);
        while (scanner.hasNext()) {
            if (scanner.hasNext("Java")) {
                javaBuilder.append(scanner.next());
                javaBuilder.append(" ");
            } else if (scanner.hasNextInt()) {
                integers.add(scanner.nextInt());
            } else {
                wordBuilder.append(scanner.next());
                wordBuilder.append(" ");
            }
        }

        System.out.println("java words: " + javaBuilder);
        System.out.println("numbers: " + integers);
        System.out.println("words: " + wordBuilder);
    }
}
