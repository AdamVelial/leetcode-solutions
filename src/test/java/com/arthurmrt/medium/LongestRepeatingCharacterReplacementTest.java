package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestRepeatingCharacterReplacementTest {
    /**
     * Example 1:
     *
     * Input: s = "ABAB", k = 2
     * Output: 4
     * Explanation: Replace the two 'A's with two 'B's or vice versa.
     */
    @Test
    void example1() {
        String s = "ABAB";
        int k = 2;

        int longest = new LongestRepeatingCharacterReplacement().characterReplacement(s, k);
        assertEquals(4, longest);
    }

    /**
     * Example 2:
     *
     * Input: s = "AABABBA", k = 1
     * Output: 4
     * Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
     * The substring "BBBB" has the longest repeating letters, which is 4.
     */
    @Test
    void example2() {
        String s = "AABABBA"; // AABABBA | 1 A | 2 AA | 3 AA
        int k = 1;

        int longest = new LongestRepeatingCharacterReplacement().characterReplacement(s, k);
        assertEquals(4, longest);
    }
}