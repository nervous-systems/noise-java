package io.nervous.noise.protocol;

public class Util {
    public static DHState generateKeyPair(DHFunction dhf) {
        DHState s;
        switch(dhf) {
            case CURVE_448:
                s = new Curve448DHState();
                break;
            case CURVE_25519:
                s = new Curve25519DHState();
                break;
            case NEW_HOPE:
                s = new NewHopeDHState();
                break;
            default:
                throw new IllegalArgumentException();
        }
        s.generateKeyPair();
        return s;
    }
}
