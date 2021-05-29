package com.java_professional.examples.lesson4.regex_data.data.ex_004_date.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date now = new Date();
        long millis = now.getTime();
        System.out.println(millis);

        Date dateSecond = new Date(millis);
        System.out.println(dateSecond);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        System.out.println(dateFormat.format(now));

        Date someDate = new Date(1622277876572L);
        System.out.println("before: " + now.before(someDate));
        System.out.println("after: " + now.after(someDate));
    }
}
