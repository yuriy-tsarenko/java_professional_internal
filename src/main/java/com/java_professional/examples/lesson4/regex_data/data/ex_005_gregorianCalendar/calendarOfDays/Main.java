package com.java_professional.examples.lesson4.regex_data.data.ex_005_gregorianCalendar.calendarOfDays;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int today = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
        int month = gregorianCalendar.get(Calendar.MONTH);
        System.out.println(gregorianCalendar);
        gregorianCalendar.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(" Sun   Mon   Tue   Wed   Thu   Fri   Sat");

        for (int i = Calendar.SUNDAY; i < weekday; i++) {
            System.out.print("      ");
        }

        do {
            int day = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%4d", day);
            if (day == today) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
            if (weekday == Calendar.SATURDAY) {
                System.out.println();
            }
            gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);
            weekday = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        } while (gregorianCalendar.get(Calendar.MONTH) == month);
    }
}
