package com.java_professional.examples.lesson3.util;

import java.net.URL;

public final class Resource {
    private Resource() {
    }

    public static String getResourcePath(String resourceName) {
        URL resource = ClassLoader.getSystemClassLoader().getResource(resourceName);
        if (resource == null) {
            return "";
        }
        return resource.getFile();
    }

    public static String getRootDir(String path) {
        String[] array = path.split("target");
        return array[0];
    }
}
