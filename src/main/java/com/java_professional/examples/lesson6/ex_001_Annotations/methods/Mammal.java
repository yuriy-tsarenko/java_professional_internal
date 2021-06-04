package com.java_professional.examples.lesson6.ex_001_Annotations.methods;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
    @Target(ElementType.TYPE) - аннотация может использоваться только с классом, интерфейсом, перечислением enum или с
     другой аннотацией.
    @Documented - указываем, что данная аннотация будет указана в сгенерированной документации JavaDoc.
    @Retention(RetentionPolicy.RUNTIME) - аннотация хранится в .class файле и доступна во время выполнения программы.
    @Inherited - аннотация автоматически наследуется в дочерних классах описанного аннотацией класса.
 */

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Mammal {

    String sound() default "Meow";

    Color[] color() default Color.BLACK;
}