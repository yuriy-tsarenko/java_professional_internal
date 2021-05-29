package com.java_professional.examples.lesson4.regex_data.regex;

import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        String str = "1 Java 2 Java 3 Java";
//        Scanner sc = new Scanner(str).useDelimiter("Java");
//        while (sc.hasNext()){
//            System.out.println(sc.next());
//        }

        Scanner sc = new Scanner(str).useDelimiter("\\s*[a-z]*\\s*");
        while (sc.hasNextInt()) {
            System.out.println(sc.nextInt());
        }
    }
}
