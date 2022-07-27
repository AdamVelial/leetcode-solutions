package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;
import ru.arthurmt.leetcode.easy.RomanToInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {


    private RomanToInteger romanToInteger  = new RomanToInteger();

    /**
     *     Example 1:
     *
     *     Input: s = "III"
     *     Output: 3
     *     Explanation: III = 3.
     */
    @Test
    void test1() {
        int result = romanToInteger.romanToInteger("III");
        assertEquals(result, 3);
    }

    /**
     *     Example 2:
     *
     *     Input: s = "LVIII"
     *     Output: 58
     *     Explanation: L = 50, V= 5, III = 3.
     *
     */
    @Test
    void test2() {
        int result = romanToInteger.romanToInteger("LVIII");
        assertEquals(result, 58);
    }

    /**
     *     Example 3:
     *     Input: s = "MCMXCIV"
     *     Output: 1994
     *     Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    @Test
    void name3() {
        int result = romanToInteger.romanToInteger("MCMXCIV");
        assertEquals(result, 1994);
    }
}