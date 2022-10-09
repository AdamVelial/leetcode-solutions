package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    /**
     * Example 1:
     *
     * Input: s = "()"
     * Output: true
     */
    @Test
    void example1() {
        boolean isValid = new ValidParentheses().isValid("()");
        assertTrue(isValid);
    }

    /**
     * Example 2:
     *
     * Input: s = "()[]{}"
     * Output: true
     */
    @Test
    void example2() {
        boolean isValid = new ValidParentheses().isValid("()[]{}");
        assertTrue(isValid);
    }

    /**
     * Example 3:
     *
     * Input: s = "(]"
     * Output: false
     */
    @Test
    void example3() {
        boolean isValid = new ValidParentheses().isValid("(]");
        assertFalse(isValid);
    }
}