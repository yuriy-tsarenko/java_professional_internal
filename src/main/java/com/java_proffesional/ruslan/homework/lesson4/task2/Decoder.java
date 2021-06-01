package com.java_proffesional.ruslan.homework.lesson4.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework4 task2
 * Напишите шуточную программу «Дешифратор», которая бы в текстовом файле могла бы заменить
 * все предлоги на слово «Java».
 */

public class Decoder {

    public static void main(String[] args) throws IOException {

        final String regex = " the\\b| or\\b| to\\b| with\\b ";
        final String string = "For the time being, Java Guardians sees the situation as status quo."
                + " If after all this we see no real activity or details after JavaOne, it will be very worrisome"
                + " indeed, Rahman said. An online petition has been posted by Java EE Guardians urging Oracle to"
                + " move forward with EE or turn the work over to others. As of Tuesday, the petition had more than "
                + "3 200 signatures.\n";

        final Pattern pattern = Pattern.compile(regex);
        final Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group());
        }

        String newStr = matcher.replaceAll(" Java ");

        System.out.println(newStr);

        FileWriter fileWriter = new FileWriter(System.getProperty("user.dir") + "/fileName.txt");
        fileWriter.write(newStr);
        fileWriter.flush();
        fileWriter.close();
    }
}