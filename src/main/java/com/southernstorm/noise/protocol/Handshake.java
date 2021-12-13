package com.southernstorm.noise.protocol;

public enum Handshake {
    NN("NN"), NK("NK"), NX("NX"),
    XN("XN"), XK("XK"), XX("XX"),
    KN("KN"), KK("KK"), KX("KX"),
    IN("IN"), IK("IK"), IX("IX");

    private final String s;

    Handshake(String s) {
        this.s = s;
    }

    public String toString() {
        return s;
    }
}
