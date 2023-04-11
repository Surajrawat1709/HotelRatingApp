package com.lcwd.hotel.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(){
        super("Resource not found");
    }
    public ResourceNotFoundException(String s) {
        super(s);
    }
}
