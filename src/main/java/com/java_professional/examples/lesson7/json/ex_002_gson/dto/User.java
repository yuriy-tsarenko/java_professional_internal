package com.java_professional.examples.lesson7.json.ex_002_gson.dto;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import java.util.Date;

@ToString
public class User {

    public int id;
    public String name;
    public String email;
    public String gender;
    public String status;

    @SerializedName("created_at")
    public Date createdAt;

    @SerializedName("updated_at")
    public Date updatedAt;
}
