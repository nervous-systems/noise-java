package com.southernstorm.noise.protocol;

public enum Hash {
    SHA256("SHA256"), SHA512("SHA512"),
    BLAKE2b("BLAKE2b"), BLAKE2s("BLAKE2s");

    private final String s;

    Hash(final String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return s;
    }
}
