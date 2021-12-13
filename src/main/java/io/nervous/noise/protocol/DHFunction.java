package io.nervous.noise.protocol;

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

    public static DHFunction fromString(final String s) {
        if(s.equals("448"))
            return CURVE_448;
        if(s.equals("25519"))
            return CURVE_25519;
        if(s.equals(NEW_HOPE))
            return NEW_HOPE;
        throw new IllegalArgumentException();
    }
}
