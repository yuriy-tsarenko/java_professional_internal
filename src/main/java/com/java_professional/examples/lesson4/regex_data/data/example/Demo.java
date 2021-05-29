package com.java_professional.examples.lesson4.regex_data.data.example;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String timeText = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime parsedTime = LocalTime.parse(timeText, formatter);

        while (parsedTime.isAfter(LocalTime.now())) {
            System.out.println("waiting.....");
            TimeUnit.MILLISECONDS.sleep(5_000);
        }

        System.out.println("Notification!!!");
    }
}
