package com.misterinevitable.leetcode.java.romantointeger;

import java.util.Map;

public class Solution {
    private static final Map<Character, Integer> digits = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
    );

    public static int romanToInt(String s) {
        int value = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (isCompositeDigit(s, i)) {
                value += digits.get(s.charAt(i + 1)) - digits.get(s.charAt(i));
                ++i; // Move past the 2nd character in the composite digit
            } else {
                value += digits.get(s.charAt(i));
            }
        }
        return value;
    }

    private static boolean isCompositeDigit(String s, int i) {
        return i < s.length() - 1 && digits.get(s.charAt(i)) < digits.get(s.charAt(i + 1));
    }
}
