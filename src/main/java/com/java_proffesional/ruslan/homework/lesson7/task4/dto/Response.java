package com.java_proffesional.ruslan.homework.lesson7.task4.dto;

import lombok.ToString;
import java.util.List;

/**
 * @author Ruslan
 * Homework7 task4
 * Создать класс Products c соответствующими полями и  используя любой из рассматриваемых ранее
 * парсеров для json преобразовать в java объекты
 */

@ToString
public class Response {

    private int code;
    private List<Product> products;
}