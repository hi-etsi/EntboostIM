package com.entboost.im.cipher;

import android.content.Context;

public class CipherUtils {
    private static CipherUtils cipherUtils;
    private String sender;
    private String receiver;

    public synchronized  CipherUtils getInstance(){
        if(cipherUtils == null){
            cipherUtils = new CipherUtils();
        }
        return cipherUtils;
    }

    private CipherUtils(){
    }


    public byte[] encyrpt(byte [] content){
        byte [] encrypted = null;



        return encrypted;
    }

    public byte[] encyrpt(String content){
        byte [] encrypted = null;


        return encrypted;
    }

    private byte[] getSessionKey(){
        byte[] sessionKey = null;


        return sessionKey;
    }

    private byte[] encryptSessionKey(byte[] sessionKey){
        byte[] encyrptedSessionKey = null;

        return encyrptedSessionKey;
    }
}
