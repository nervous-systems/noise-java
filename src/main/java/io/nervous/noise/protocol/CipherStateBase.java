package io.nervous.noise.protocol;

import javax.crypto.ShortBufferException;

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
