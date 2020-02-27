package com.ana.algorithms.exercises;

import java.util.*;

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

    public static void GCD(int num1, int num2) { //TODO
        System.out.println("GCD for " + num1 + " and " + num2 + " is " + findGCD(num1, num2));
    }

    public static void printLeftPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
    }

    public static void printReversedLeftPyramid(int n) {
        printReversedLeftPyramid(n, 0);
    }

    public static void printRightPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void printReversedRightPyramid(int n) {
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (j < n - 1 - i) System.out.print("  ");
                else System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void removeDuplicatesV1(int[] array) {
        //Integer[] temp = new Integer[array.length];
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        int j = 0;
        //temp[j] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[j] != array[i]) {
                j++;
                array[j] = array[i];
            }
        }
        j++;
        int[] temp = new int[j];
        for (int i = 0; i < j; i++)
            temp[i] = array[i];
        System.out.println(Arrays.toString(temp));
    }

    public static void removeDuplicatesV2(int[] array) {
        int[] temp = new int[array.length];
        int j = 0;
        System.out.println(Arrays.toString(array));
        if (array.length != 1 || array.length != 0) {

            for(int i =0; i < array.length - 1; i++) {
                if (array[i] != array[i+1]) temp[j++] = array[i];
            }
            temp[j++] = array[array.length - 1];
        }
        //temp = new int[j];
        for (int i = 0; i < j; i++) {
            temp[i] = array[i];
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void removeDuplicatesV3(ArrayList<?> array) {

    }

    public static void removeDuplicates(String[] array) { }

    public static void removeDuplicates(char[] array) { }

    public static void squareRoot(int number) {
        int div = number / 2;
        if (number != 0 && div != 0) {
            for (int i = 2; i <= div; i++) {
                if (number / i == i && (number % i) == 0) {
                    System.out.println(number / i);
                    return;
                }
            }
            System.out.println("nothing;");
        }
    }

    public static void reverseInPlace(int[] array) {
        System.out.println(Arrays.toString(array));
        int i = 0, j = array.length - 1, temp;
        while(i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++; j--;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void reverseWordsInSentence(String sentence) {
        System.out.println(sentence);
        String[] array = sentence.split(" ");
        int i = 0, j = array.length - 1;
        String temp, newSentence = "";
        while(i < j) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++; j--;
        }
        for (int w = 0; w < array.length; w++)
            newSentence += array[w] + " ";

        System.out.println(newSentence);
    }

    public static void isAnagram(String string1, String string2) {
        if (string1.length() == string2.length()) {
            for(int i = 0; i < string1.length();  i++) {
                int index = string2.indexOf(string1.charAt(i));
                if (index != -1) {
                    string2 = string2.substring(0, index) + string2.substring(index + 1);
                }
            }
            if (string2.length() != 0) System.out.println("FALSE");
            else System.out.println("TRUE");
        }
        else System.out.println("FALSE");
    }

    public static void reverseNumber(int number) {
        System.out.println(number);
        int n = getNumberOfDigits(number) + 1, result = 0;
        int i = 0, j = n-1;
        while (i <= n && j >= -1) {
            result += ((int)((number % Math.pow(10, i)) / Math.pow(10, i - 1))) * Math.pow(10,j);
            i++; j--;
        }
        System.out.println(result);
    }

    private static void printReversedLeftPyramid(int n, int i) {
        if (i <= n) {
            printReversedLeftPyramid(n, i + 1);
            for (int j = 0; j < i; j++)
                System.out.print("* ");
            System.out.print("\n");
        }
        else return;
    }

    public static void firstNonRepeated(String input) {
        System.out.println("First non repeated character of " + input + " is :" + nonRepeated(input));
    }

    public static void transposeMatrix(int[][] matrix) {
        printMatrix(matrix);
        int n1 = matrix[0].length, n2 = matrix.length;
        int[][] newMatrix = new int[n1][n2];

        for(int i=0; i<n1; i++)
            for(int j=0; j < n2; j++) {
                newMatrix[i][j] = matrix[j][i];
            }

        printMatrix(newMatrix);

    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
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

    private static int findGCD(int x, int y) {
        if (y == 0) return x;
        else return findGCD(y, x % y);
    }

    private static String nonRepeated(String input) {
        if (input.length() == 1) return input;
        String c = input.substring(0,1);
        input = input.substring(1);
        if (input.indexOf(c) == -1) return c;
        else return nonRepeated(input);
    }
}
