package com.java_proffesional.ruslan.homework.lesson4.task3;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework4 task3
 * Спроектируйте и разработайте метод, определяющий, сколько времени прошло с заданной даты. С помощью этого методы
 * выведите в консоль, сколько времени прошло с вашего дня рождения в удобном для восприятия виде,
 * например: «Вам исполнилось 20 лет, 3 месяца, 18 дней, 4 часа, 5 минут и 10 секунд».
 */

public class Main {

    public static void main(String[] args)  {

        System.out.println("Enter your birthday in the format NUMBER/MONTH/YEAR");
        Scanner scanner = new Scanner(System.in);
        String timeText = scanner.nextLine();

        SimpleDateFormat fromUser = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date dateFromUser = null;
        try {
            dateFromUser = fromUser.parse(timeText);
        } catch (ParseException e) {
            System.out.println("data entry ERROR, use / between digits");
        }

        String parsedTime = myFormat.format(dateFromUser);
        DateTime myBirthDate = DateTime.parse(parsedTime);

        DateTime now = new DateTime();

        Period period = new Period(myBirthDate, now);

        PeriodFormatter formatter = new PeriodFormatterBuilder()
                .appendYears().appendSuffix(" year, ", " years, ")
                .appendMonths().appendSuffix(" month, ", " months, ")
                .appendWeeks().appendSuffix(" week, ", " weeks, ")
                .appendDays().appendSuffix(" day, ", " days, ")
                .appendHours().appendSuffix(" hour, ", " hours, ")
                .appendMinutes().appendSuffix(" minute, ", " minutes, ")
                .appendSeconds().appendSuffix(" second", " seconds")
                .printZeroNever()
                .toFormatter();

        String timePast = formatter.print(period);
       System.out.println("Are you " + timePast + "  ago.");



    }
}