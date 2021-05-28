package com.java_professional.examples.lesson3;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;


public class SimpleURL {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://gorest.co.in/public-api/categories");
            Scanner scanner = new Scanner(url.openStream());
            StringBuilder builder = new StringBuilder();
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
                builder.append("\n");
            }
            FileWriter fileWriter = new FileWriter("example.json");
            fileWriter.write(builder.toString());
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//вариант с BufferedReader
//    public static void main(String[] args) throws MalformedURLException {
//        URL url = new URL("https://gorest.co.in/public-api/categories");
//        try {
//            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
//            String str;
//            while ((str = br.readLine()) != null) {
//                System.out.println(str);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
    }
}
