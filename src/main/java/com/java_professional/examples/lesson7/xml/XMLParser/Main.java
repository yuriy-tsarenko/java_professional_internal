package com.java_professional.examples.lesson7.xml.XMLParser;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Считываем файл.xml
        XmlParser xml = new XmlParser("D:\\IT\\IdeaProjects\\java_profesional_internal\\src\\main\\java\\com\\"
                + "java_professional\\examples\\lesson7\\xml\\XMLParser\\2.xml");

        // Указываем путь, что будем считывать с файла xml
        String value = xml.get("catalog/book/author");
        System.out.println(value);
    }
}
