package com.java_professional.examples.lesson3.fileInfo;

import org.apache.log4j.Logger;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(System.out), true)) {
            File file = new File("D:\\IT\\IdeaProjects\\java_profesional_internal\\src\\main\\java\\com\\"
                    + "java_professional\\examples\\lesson3\\readingFile\\Main.java");
            printWriter.println();
            printWriter.println("File \"" + file.getName() + "\" " + (file.exists() ? "" : "not ") + "found");
            printWriter.println("Can " + (file.canRead() ? "" : "not ") + "read");
            printWriter.println("Can " + (file.canWrite() ? "" : "not ") + "write");
            printWriter.println("Length " + file.length() + " ");
            printWriter.println();
            File d = new File("D:\\IT\\IdeaProjects\\java_profesional_internal\\src\\main\\java\\com\\"
                    + "java_professional\\examples\\lesson3");
            printWriter.println("Folder:");
            if (d.exists() && d.isDirectory()) {
                String[] s = d.list();
                for (int i = 0; i < s.length; i++) {
                    printWriter.println(s[i]);
                }
            }
        } catch (Exception e) {
            log.error(e);
        }
    }
}

