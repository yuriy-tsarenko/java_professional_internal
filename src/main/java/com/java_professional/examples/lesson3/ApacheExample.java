package com.java_professional.examples.lesson3;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import static com.java_professional.examples.lesson3.util.Resource.getResourcePath;
import static com.java_professional.examples.lesson3.util.Resource.getRootDir;

public class ApacheExample {
    public static void main(String[] args) {
        try {
            work();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void work() throws IOException {
        String resourcePath = getResourcePath("demo.json");
        File file = FileUtils.getFile(resourcePath);
        File dir = new File(getRootDir(resourcePath));
        FileUtils.copyFileToDirectory(file, dir);
        String data = FileUtils.readFileToString(file, Charset.defaultCharset());
        System.out.println(data);
    }

}
