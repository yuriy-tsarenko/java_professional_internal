package com.java_professional.examples.lesson4.regex_data.data.example;

import java.util.concurrent.TimeUnit;

public class DemoProgressBar {

    private static final String PROGRESS_BAR = "[--------------------------------------------------]";


    public static void main(String[] args) throws InterruptedException {
        printProgress();
    }

    public static void printProgress() throws InterruptedException {
        StringBuilder builder = new StringBuilder(PROGRESS_BAR);
        for (int i = 0; i < 50; i++) {
            builder.replace(i + 1, i + 2, "*");
            System.out.print(builder);
            System.out.print("\r");
            TimeUnit.MILLISECONDS.sleep(1_000);
        }
        System.out.print(builder);
    }
}
