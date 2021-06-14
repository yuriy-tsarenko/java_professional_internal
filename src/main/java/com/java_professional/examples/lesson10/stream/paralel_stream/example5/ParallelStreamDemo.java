package com.java_professional.examples.lesson10.stream.paralel_stream.example5;

import java.util.ArrayList;
import java.util.List;

/**
 * все, что вам нужно сделать, это создать параллельный поток,
 * вместо последовательного потока. И чтобы вас удивить, это действительно очень
 * легко.
 * <p>
 * В любое время, когда вы хотите выполнить конкретную работу, используя несколько потоков,
 * все, что вам нужно, чтобы вызвать метод parallelStream () вместо метода stream ()
 * метод.
 */
public class ParallelStreamDemo {

    public static void main(String[] args) {

        long timeOne;
        long timeTwo;
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            employees.add(new Employee("A", 20000));
            employees.add(new Employee("B", 3000));
            employees.add(new Employee("C", 15002));
            employees.add(new Employee("D", 7856));
            employees.add(new Employee("E", 200));
            employees.add(new Employee("F", 50000));
        }

        /***** Here We Are Creating A 'Sequential Stream' & Displaying The Result *****/
        timeOne = System.currentTimeMillis();
        System.out.println("Sequential Stream Count?= "
                + employees.stream().filter(e -> e.getSalary() > 15000).count());

        timeTwo = System.currentTimeMillis();
        System.out.println("Sequential Stream Time Taken?= " + (timeTwo - timeOne) + "\n");

        /***** Here We Are Creating A 'Parallel Stream' & Displaying The Result *****/
        timeOne = System.currentTimeMillis();
        System.out.println("Parallel Stream Count?= "
                + employees.parallelStream().filter(e -> e.getSalary() > 15000).count());

        timeTwo = System.currentTimeMillis();
        System.out.println("Parallel Stream Time Taken?= " + (timeTwo - timeOne));
    }
}