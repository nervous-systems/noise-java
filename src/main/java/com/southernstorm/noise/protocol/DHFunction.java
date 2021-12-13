package com.southernstorm.noise.protocol;

public enum DHFunction {
    CURVE_448("448"),
    CURVE_25519("25519"),
    NEW_HOPE("NewHope");

    private final String s;

    DHFunction(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
