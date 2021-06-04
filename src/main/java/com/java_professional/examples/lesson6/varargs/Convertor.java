package com.java_professional.examples.lesson6.varargs;

import java.util.concurrent.Callable;

public class Convertor implements Callable<Integer> {

    private int count = 10;

    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public Integer call() throws Exception {
        return count * 10;
    }
}
