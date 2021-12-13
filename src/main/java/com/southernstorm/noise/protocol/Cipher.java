package com.southernstorm.noise.protocol;

public enum Cipher {
    AESGCM("AESCGM"), ChaChaPoly("ChaChaPoly");

    private final String s;

    Cipher(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
