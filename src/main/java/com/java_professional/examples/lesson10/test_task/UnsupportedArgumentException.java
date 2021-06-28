package com.java_professional.examples.lesson10.test_task;

public class UnsupportedArgumentException extends Exception {

    /**
     * Constructs a new exception with null as its detail message. The cause is not initialized, and may subsequently
     * be initialized by a call to initCause.
     */
    public UnsupportedArgumentException() {
    }

    /**
     * Constructs a new exception with the specified detail message. The cause is not initialized, and may subsequently
     * be initialized by a call to initCause.
     * Params:
     * @param message – the detail message. The detail message is saved for later retrieval by the getMessage() method.
     */
    public UnsupportedArgumentException(String message) {
        super(message);
    }
}
