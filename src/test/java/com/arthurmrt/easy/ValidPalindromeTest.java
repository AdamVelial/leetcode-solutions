package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    /**
     * Example 1:
     *
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     * Explanation: "amanaplanacanalpanama" is a palindrome.
     */
    @Test
    void example1() {
        String s = "A man, a plan, a canal: Panama";

        boolean isPalindrome = new ValidPalindrome().isPalindrome(s);

        assertTrue(isPalindrome);
    }

    /**
     * Example 2:
     *
     * Input: s = "race a car"
     * Output: false
     * Explanation: "raceacar" is not a palindrome.
     */
    @Test
    void example2() {
        String s =  "race a car";

        assertFalse(new ValidPalindrome().isPalindrome(s));
    }

    /**
     * Example 3:
     *
     * Input: s = " "
     * Output: true
     * Explanation: s is an empty string "" after removing non-alphanumeric characters.
     * Since an empty string reads the same forward and backward, it is a palindrome
     */
    @Test
    void example3() {
        String s = "";

        assertTrue(new ValidPalindrome().isPalindrome(s));
    }
}