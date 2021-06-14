package com.java_professional.examples.lesson10.graphics;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public class Main {

    public static void main(String[] args) {
        System.out.println(print());
    }

    private static String print() {
        int width = 100;
        int height = 10;
        int coordsX = 5;
        int coordsY = 9;
        String drawItem = "¤";
        String inverseDrawItem = " ";
        StringBuilder message = new StringBuilder();
        BufferedImage image = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics2D = (Graphics2D) image.getGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics2D.scale(1, 1);
        graphics2D.drawString("J A V A", coordsX, coordsY);
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                message.append(image.getRGB(x, y) == -16777216 ? inverseDrawItem : drawItem);
            }
            message.append("\n");
        }
        return message.toString();
    }
}
