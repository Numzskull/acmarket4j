package dev.vaziak.acmarket.response.exceptions;

import java.io.IOException;

public class ResourceNotFoundException extends IOException {
    public ResourceNotFoundException() {
        super();
    }

    public ResourceNotFoundException(String s) {
        super(s);
    }
}
