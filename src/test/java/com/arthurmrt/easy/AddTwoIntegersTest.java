package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoIntegersTest {

    /**
     * Example 1:
     *
     * Input: num1 = 12, num2 = 5
     * Output: 17
     * Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.
     */
    @Test
    void sumTest() {
        AddTwoIntegers add = new AddTwoIntegers();
        assertEquals(17, add.sum(12, 5));
    }

    /**
     * Example 2:
     *
     * Input: num1 = -10, num2 = 4
     * Output: -6
     * Explanation: num1 + num2 = -6, so -6 is returned.
     */
    @Test
    void sumTest2() {
        AddTwoIntegers add = new AddTwoIntegers();
        assertEquals(-6, add.sum(-10, 4));
    }


}