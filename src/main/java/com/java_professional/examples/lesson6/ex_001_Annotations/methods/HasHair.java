package com.java_professional.examples.lesson6.ex_001_Annotations.methods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// @Target(ElementType.METHOD) - аннотация может использоваться только с методом класса.
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.SOURCE)
public @interface HasHair {
    int length() default 10;
}
