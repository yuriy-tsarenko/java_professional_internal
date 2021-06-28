package com.java_professional.examples.lesson10.test_task;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.regex.Pattern;

//TODO: add javadoc
public class SequenceResolver {

    //TODO: add javadoc
    private SequenceResolver() {
    }

    //TODO: add javadoc
    public static String resolve(String sequence) throws UnsupportedArgumentException {
        if (!Pattern.compile("[1-7]*").matcher(sequence).matches()) {
            throw new UnsupportedArgumentException(String.format("unexpected arg: %s, only 1-7", sequence));
        }
        return Arrays.stream(sequence.split(""))
                .distinct()
                .sorted()
                .reduce("", sequenceBuilder);
    }

    //TODO: add javadoc
    private static final BinaryOperator<String> sequenceBuilder = (accumulator, number) -> {
        if (accumulator.isEmpty()) {
            accumulator = number;
        } else {
            String[] accumulators = accumulator.split("[-,]");
            int last = Integer.parseInt(accumulators[accumulators.length - 1]);
            int next = Integer.parseInt(number);
            if ((next - last == 1) && (accumulator.substring(0, accumulator.length() - 1).endsWith("-"))) {
                accumulator = accumulator.substring(0, accumulator.length() - 1) + number;
            } else if (next - last == 1) {
                accumulator = accumulator + "-" + number;
            } else {
                accumulator = accumulator + "," + number;
            }
        }
        return accumulator;
    };
}
