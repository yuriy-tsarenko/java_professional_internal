package com.java_proffesional.ruslan.homework.lesson5.task2;

import java.util.Objects;

/**
 * @author Ruslan
 * Homework5 task2
 * Напишите программу, которая будет выводить всю информацию о классе, пользователь сам выбирает,
 * какой именно класс интересует.
 */

public class Monitor  {
    private int resolutionX;
    private int resolutionY;

  public   Monitor(int resolutionX, int resolutionY) {

        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolutionX, resolutionY);
    }
}