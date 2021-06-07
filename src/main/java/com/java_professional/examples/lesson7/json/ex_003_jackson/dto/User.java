package com.java_professional.examples.lesson7.json.ex_003_jackson.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.ToString;

import java.util.Date;

@ToString
public class User {

    @JsonProperty("id")
    public Integer id;

    @JsonProperty("name")
    public String name;

    @JsonProperty("email")
    public String email;

    @JsonProperty("gender")
    public String gender;

    @JsonProperty("status")
    public String status;

    @JsonProperty("created_at")
    public Date createdAt;

    @JsonProperty("updated_at")
    public Date updatedAt;

    @JsonCreator
    public User(
            @JsonProperty("id") Integer id,
            @JsonProperty("name") String name,
            @JsonProperty("email") String email,
            @JsonProperty("gender") String gender,
            @JsonProperty("status") String status,
            @JsonProperty("created_at") Date createdAt,
            @JsonProperty("updated_at") Date updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.status = status;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
}
