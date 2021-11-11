package dev.vaziak.acmarket.response.exceptions;

import java.io.IOException;

public class ProfileNotFoundException extends IOException {
    public ProfileNotFoundException() {
        super();
    }

    public ProfileNotFoundException(String s) {
        super(s);
    }
}
