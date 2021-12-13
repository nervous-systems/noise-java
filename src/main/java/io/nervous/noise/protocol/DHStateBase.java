package io.nervous.noise.protocol;

public abstract class DHStateBase implements DHState {
    @Override
    public byte[] getPrivateKey() {
        byte[] out = new byte[getPrivateKeyLength()];
        getPrivateKey(out);
        return out;
    }

    @Override
    public void getPrivateKey(byte[] key) {
        getPrivateKey(key, 0);
    }

    @Override
    public void setPrivateKey(byte[] key) {
        setPrivateKey(key, 0);
    }

    @Override
    public byte[] getPublicKey() {
        byte[] out = new byte[getPublicKeyLength()];
        getPublicKey(out);
        return out;
    }

    @Override
    public void getPublicKey(byte[] key) {
        getPublicKey(key, 0);

    }

    @Override
    public void setPublicKey(byte[] key) {
        setPublicKey(key, 0);
    }
}
