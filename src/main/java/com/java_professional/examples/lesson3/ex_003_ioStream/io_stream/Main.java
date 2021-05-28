package com.java_professional.examples.lesson3.ex_003_ioStream.io_stream;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws Exception {

        try (OutputStreamWriter streamWriter = new OutputStreamWriter(System.out, StandardCharsets.UTF_8);
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter printWriter = new PrintWriter(streamWriter, true)) {
            //true – означает, что после вызова printWriter.println(…) можно не вызывать printWriter.flush().
            String line = "Hello world";
            System.out.println("System.out works: " + line);
            printWriter.println("PrintWriter works: " + line);

            char c;
            printWriter.println("Chars out: ");
            while ((c = (char) bufferedReader.read()) != 'q') {
                printWriter.println(c);
            }

            printWriter.println("Line out:");
            do {
                line = bufferedReader.readLine();
                printWriter.println(line);
            } while (!line.equals("q"));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

