package com.java_professional.examples.lesson7.json.ex_003_jackson.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class Response {

    @JsonProperty("code")
    private int code;

    @JsonProperty("data")
    private List<User> data;

    @JsonCreator
    public Response(
            @JsonProperty("code") int code,
            @JsonProperty("data") List<User> data) {
        this.code = code;
        this.data = data;
    }
}
