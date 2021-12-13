package com.southernstorm.noise.protocol;

public enum Prefix {
    NOISE("Noise"), NOISE_PSK("NoisePSK");

    private final String s;

    Prefix(final String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
