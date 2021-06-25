package com.java_proffesional.ruslan.homework.test.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;


/**
 * @author Ruslan
 * Дано число (Integer), каждая цифра которого находится в диапазоне 1...7 в соответствии с днем недели
 * (1 - понедельник,2 - вторник... 7 - воскресенье). Например, 126 - означает понедельник, вторник и субботу.
 * Преобразуйте это число в строку, разделяя каждую цифру знаком ',' для дней последовательности, не следующих друг
 * за другом, или '-' для дней последовательности, следующих друг за другом.
 * Перед этим следует отсортировать и удалить дубликаты, например
 * (12365375 -> 12335567 -> 123567 -> '1-3,5-7').
 * Примеры: (2 -> '2'), (56 -> '5-6'), (24 -> '2,4'), (123 -> '1-3'),
 * (135 -> '1,3,5'), (125 -> '1-2,5'), (12367 -> '1-3,6-7'), (134567 -> '1,3-7')
 */

public class Test {

    public static void main(String[] args) {

        System.out.println("Input number: ");
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String line = reader.readLine();
            System.out.println("result: " + stream(line));
        } catch (UnsupportedOperationException | IOException x) {
            System.err.println(x);
        }
    }

    private static String stream(String line) throws UnsupportedOperationException {
        boolean found = Pattern.matches("[1-7]*", line);
        if (found) {
            return Arrays.stream(line.split(""))
                    .distinct()
                    .sorted()
                    .reduce("", algorithm);
        } else {
            throw new UnsupportedOperationException(String.format("< %s >", "only 1..7"));
        }
    }


    private static BinaryOperator<String> algorithm = (lines, number) -> {

        if (!lines.isEmpty()) {
            String[] array = lines.split("[-,]");
            int last = parseInt(array[array.length - 1]);
            int next = parseInt(number);

            if ((next - last != 1) || (!lines.substring(0, lines.length() - 1).endsWith("-"))) {
                if (next - last == 1) {
                    lines = lines + "-" + number;
                } else {
                    lines = lines + "," + number;
                }
            } else {
                lines = lines.substring(0, lines.length() - 1) + number;
            }
        } else {
            lines = number;
        }
        return lines;

    };

}