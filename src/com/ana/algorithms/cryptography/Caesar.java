package com.ana.algorithms.cryptography;

public class Caesar {
    //TODO
    int shift;
    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private StringBuilder text, cipher;

    public Caesar(int shift) {
        this.shift = shift;
    }

    public String crypt(String text) {
        cipher = new StringBuilder(text.toUpperCase());
        for(int i = 0; i < text.length(); i++) {
            int index = alphabet.indexOf(text.charAt(i));
            int replace = (index + shift) % 26;

            cipher.setCharAt(i, alphabet.charAt(replace));
        }
        return cipher.toString();
    }

    public String encrypt(String cipher) {
        text = new StringBuilder(cipher.toUpperCase());

        for(int i = 0; i < cipher.length(); i++) {
            int index = alphabet.indexOf(cipher.charAt(i));
            int replace = (index - shift) % 26;

            if (replace < 0) replace *= -1;

            text.setCharAt(i, alphabet.charAt(replace));
        }
        return text.toString();
    }

}
