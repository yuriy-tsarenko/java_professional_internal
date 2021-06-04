package com.java_professional.examples.lesson6.varargs;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

        String[] strings = new String[]{"line1", "line2", "line3"};
        String buildText2 = buildText2(strings);
        String buildText = buildText(strings);
        int data = 0;
        String line1 = null;
        try {
            data = buildData1(new Convertor());
            line1 = buildData2("line1");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(buildText2);
        System.out.println(buildText);
        System.out.println(data);
        System.out.println(line1);
    }

    public static String buildText(String... strings) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]).append("\n");
        }
        return builder.toString();
    }

    public static String buildText2(String[] strings) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < strings.length; i++) {
            builder.append(strings[i]).append("\n");
        }
        return builder.toString();
    }

    public static <T extends Callable<Integer>> int buildData1(T type) throws Exception {
        return type.call();
    }

    @SuppressWarnings({"unchecked"})
    public static <T> T buildData2(T... type) throws Exception {
        if (type instanceof String[]) {
            String[] strings = (String[]) type;
            StringBuilder builder = new StringBuilder();
            for (String string : strings) {
                builder.append(string).append("\n");
            }
            return (T) builder.toString();
        } else if (type instanceof Integer[]) {
            Integer[] integers = (Integer[]) type;
            Integer temp = 0;
            for (Integer integer : integers) {
                temp = temp + integer;
            }
            return (T) temp;
        } else {
            throw new Exception("incorrect data type");
        }
    }
}
