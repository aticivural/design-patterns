package com.vural.dp.behavioral.strategy.sample01;

import org.junit.Test;

public class EncryptorTest {

    @Test
    public void testEncrypt() throws Exception {
        EncryptionStrategy aesStrategy = new AesEncryptionStrategy();
        Encryptor aesEncryptor = new Encryptor(aesStrategy);
        aesEncryptor.setPlainText("This is plain text");
        aesEncryptor.encrypt();

        EncryptionStrategy blowfishStrategy = new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor = new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
    }
}