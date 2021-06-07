package com.java_professional.examples.lesson7.json.ex_002_gson.dto;

import lombok.ToString;

import java.util.List;

@ToString
public class Response {
    private int code;
    private List<User> data;
}
