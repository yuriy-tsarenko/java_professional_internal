package com.java_proffesional.ruslan.homework.lesson4.addtask;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * by Ruslan svitliy.rk@gmail.com
 * Homework4 addtask
 * Напишите консольное приложение, позволяющие пользователю зарегистрироваться под «Логином», состоящем только из
 * символов латинского алфавита, и пароля, состоящего из цифр и символов
 */


public class Main {
    public static void main(String[] args) {

        final String Login = "^[a-zA-Z]{8}$";
        final String Password = "\\d{8}";

        boolean wrongPass = true;

        for (int passAttempts = 0; passAttempts < 3 && wrongPass; passAttempts++) {
            System.out.print("\nEnter your 8-letter login without spaces.: ");
            Scanner input = new Scanner(System.in);
            String inputLog = input.nextLine();
            Pattern pattern = Pattern.compile(Login);
            Matcher matcher = pattern.matcher(inputLog);

            if (matcher.matches()) {
                System.out.println("\nSuccessfully!");
                System.out.print("\nEnter an 8-digit password without spaces.: ");
                String inputPass = input.nextLine();
                Pattern pattern2 = Pattern.compile(Password);
                Matcher matcher2 = pattern2.matcher(inputPass);
                wrongPass = false;
                input.close();
                
                if (matcher2.matches()) {
                    System.out.println("\nSuccessfully!");
                    wrongPass = false;
                    input.close();
                } else {

                    System.out.println("\nWrong Login or Password Try Again");


                }
            }
        }
    }
}