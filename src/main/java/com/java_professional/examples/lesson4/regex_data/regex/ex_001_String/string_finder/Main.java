package com.java_professional.examples.lesson4.regex_data.regex.ex_001_String.string_finder;

public class Main {
    public static void main(String[] args) {
        String str = "For the time being, Java Guardians sees the situation as status quo. "
                + "\"If after all this we see"
                + "no real activity or details after JavaOne, it will be very worrisome indeed,\" "
                + "Rahman said. An online petition has been posted by Java EE Guardians urging "
                + "Oracle to move forward with EE or "
                + "turn the work over to others. As of Tuesday, the petition had more than 3,200 signatures. "
                + "Java EE Guardians has pondered developing enterprise-level Java improvements on its own.";
        String[] array = str.split("[.,]");
        for (String temp : array) {
            System.out.println(temp);
        }
    }
}
