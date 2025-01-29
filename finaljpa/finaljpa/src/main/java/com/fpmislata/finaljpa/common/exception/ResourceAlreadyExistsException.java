package com.fpmislata.finaljpa.common.exception;

public class ResourceAlreadyExistsException extends RuntimeException {

    public ResourceAlreadyExistsException() {
        super("The resource already exists");
    }

    public ResourceAlreadyExistsException(String message) {
        super(message);
    }
}
