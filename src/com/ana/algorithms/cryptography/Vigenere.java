package com.ana.algorithms.cryptography;

public class Vigenere {
    private String key;
    private StringBuilder text, cipher;
    private static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private  static int num = alphabet.length();
    private int shift;

    public String crypt(String text, String key) {
        cipher = new StringBuilder(text.toUpperCase());
        int j = 0;
        for(int i = 0; i < cipher.length(); i++) {
            shift = alphabet.indexOf(key.toUpperCase().charAt(i % key.length()));
            int index = alphabet.indexOf(cipher.charAt(i));
            int replace = (index + shift) % num;

            cipher.setCharAt(i, alphabet.charAt(replace));
        }
        return cipher.toString();
    }

    public String encrypt(String cipher, String key) {
        text = new StringBuilder(cipher.toUpperCase());

        for(int i = 0; i < text.length(); i++) {
            shift = alphabet.indexOf(key.toUpperCase().charAt(i % key.length()));
            int index = alphabet.indexOf(text.charAt(i));
            int replace = index - shift;

            if (replace < 0) replace += num ;

            text.setCharAt(i, alphabet.charAt(replace));
        }
        return text.toString();
    }
}
