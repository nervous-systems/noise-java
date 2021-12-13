package io.nervous.noise.protocol;

public abstract class CipherStateBase implements CipherState {
    public void getKey(byte[] out) {
        getKey(out, 0);
    }

    public byte[] getKey() {
        byte[] out = new byte[getKeyLength()];
        getKey(out);
        return out;
    }
}
