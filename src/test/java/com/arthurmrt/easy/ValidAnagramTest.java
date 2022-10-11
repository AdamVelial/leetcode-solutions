package com.arthurmrt.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ValidAnagramTest {

    /**
     * Example 1:
     * <p>
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     **/
    @Test
    void example1() {
        String s = "anagram", t = "nagaram";

        boolean isAnagram = new ValidAnagram().isAnagram(s, t);
        Assertions.assertTrue(isAnagram);
    }

    /**
     * Example 2:
     * <p>
     * Input: s = "rat", t = "car"
     * Output: false
     */
    @Test
    void example2() {
        String s = "rat", t = "car";


        boolean isAnagram = new ValidAnagram().isAnagram(s, t);
        Assertions.assertFalse(isAnagram);
    }

    /**
     * Example 3
     * "aacc"
     * "ccac"
     *
     * false
     */
    @Test
    void example3() {
        String s = "aacc";
        String t = "ccac";

        boolean isAnagram = new ValidAnagram().isAnagram(s, t);
        Assertions.assertFalse(isAnagram);
    }
}