package com.ana.algorithms.exercises;

public class Exercises {
    private static int inputInteger;
    private static String reversed;

    public static String isPalindrome(String inputString) {
        int i = 0, j = inputString.length() - 1;

        while (i < j) {
            if (inputString.charAt(i) == ' ') i++;
            if (inputString.charAt(j) == ' ') j--;

            if (inputString.charAt(i) != inputString.charAt(j))
                if (Math.abs(inputString.charAt(i) - inputString.charAt(j)) != 32)
                    return "String : " + inputString + " is not palindrome!";
            i++;
            j--;
        }

        return "String : " + inputString + " is palindrome!";
    }

    public static String isPalindrome(int input) {
        inputInteger = input;
        int n = getNumberOfDigits(inputInteger);
        int i = 1, j = n;
        int left, right;

        while (i < j) {
            left = getDigit(j);
            right = getDigit(i);
            if (left != right) return "Integer : " + inputInteger + " is not palindrome!";
            i++; j--;
        }

        return "Integer : " + inputInteger + " is palindrome!";
    }

    public static String isArmstrongNumber(int input) {
        inputInteger = input;
        int n = getNumberOfDigits(inputInteger);
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += (int) Math.pow(getDigit(i) ,3);
        }

        if (result == inputInteger) return "Number " + inputInteger + " is Armstrong number!";
        return "Number " + input + " is not Armstrong number!";
    }

    public static String reverse(String str) {
        reversed = "";
        reverseString(str);
        return str + " reversed is " + reversed;
    }

    public static String findGCD(int num1, int num2) {
        int gcd = 1, div = 2;

        if (num1 == 0 || num2 == 0) return "DIVISION BY ZERO!";

        if (num1 > num2 && (num1 % num2) == 0) gcd = num2;
        else if (num2 % num1 == 0) gcd = num1;

        else {
            while ((num1 % div == 0) && (num2 % div == 0) && isPrime(div)) {
                num1 /= div;
                num2 /= div;
                gcd *= div;
                div = 2;
            }
        }

        return "GCD for " + num1 + " and " + num2 + " is: " + gcd;
    }



    private static int getNumberOfDigits(int inputInteger) {
        int n = 1, div = 10;

        while ((inputInteger / div) != 0) {
            n++;
            div *= 10;
        }
        return n;
    }

    private static int getDigit(int i) {
        return (inputInteger % (int)Math.pow(10 , i)) / (int)Math.pow(10 , (i - 1));
    }

    private static void reverseString(String str) {
        if (str.length() !=  0) {
            String prefix = str.substring(0,1);

            str = str.substring(1);

            reverseString(str);

            reversed += prefix;
        }
    }

    private static boolean isPrime(int num) {
        return true;
    }
}
