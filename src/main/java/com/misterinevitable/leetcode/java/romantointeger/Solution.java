package com.misterinevitable.leetcode.java.romantointeger;

public class Solution {
    public static int romanToInt(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (isCompositeDigit(s, i)) {
                value += digit(s.charAt(i + 1)) - digit(s.charAt(i));
                ++i; // Move past the 2nd character in the composite digit
            } else {
                value += digit(s.charAt(i));
            }
        }
        return value;
    }

    private static boolean isCompositeDigit(String s, int i) {
        return i < s.length() - 1 && digit(s.charAt(i)) < digit(s.charAt(i + 1));
    }

    private static int digit(char ch) {
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X'-> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException("Not a Roman numeral: " + ch);
        };
    }
}
