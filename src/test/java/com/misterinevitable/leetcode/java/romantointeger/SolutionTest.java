package com.misterinevitable.leetcode.java.romantointeger;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void romanToInt() {
        String[] oneToTen = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        assertArrayEquals(
                IntStream.rangeClosed(1, 10).toArray(),
                Arrays.stream(oneToTen).mapToInt(Solution::romanToInt).toArray());

        assertEquals(11, Solution.romanToInt("XI"));
        assertEquals(14, Solution.romanToInt("XIV"));
        assertEquals(15, Solution.romanToInt("XV"));
        assertEquals(16, Solution.romanToInt("XVI"));
        assertEquals(20, Solution.romanToInt("XX"));
        assertEquals(40, Solution.romanToInt("XL"));
        assertEquals(50, Solution.romanToInt("L"));
        assertEquals(60, Solution.romanToInt("LX"));
        assertEquals(99, Solution.romanToInt("XCIX"));
        assertEquals(100, Solution.romanToInt("C"));
        assertEquals(149, Solution.romanToInt("CXLIX"));
        assertEquals(150, Solution.romanToInt("CL"));
        assertEquals(499, Solution.romanToInt("CDXCIX"));
        assertEquals(500, Solution.romanToInt("D"));
        assertEquals(701, Solution.romanToInt("DCCI"));
        assertEquals(749, Solution.romanToInt("DCCXLIX"));
        assertEquals(750, Solution.romanToInt("DCCL"));
        assertEquals(751, Solution.romanToInt("DCCLI"));
        assertEquals(999, Solution.romanToInt("CMXCIX"));
        assertEquals(1000, Solution.romanToInt("M"));
        assertEquals(2023, Solution.romanToInt("MMXXIII"));
    }
}
