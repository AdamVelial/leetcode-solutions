package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringWithoutRepeatingCharactersTest {
    /**
     * Example 1:
     * <p>
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     **/
    @Test
    void example1() {
        String s = "abcabcbb";
        int longestSubstring = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        assertEquals(3, longestSubstring);
    }

    /**
     * Example 2:
     * <p>
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     **/
    @Test
    void example2() {
        String s = "bbbbb";
        int longestSubstring = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        assertEquals(1, longestSubstring);
    }

    /**
     * Example 3:
     * <p>
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a sub
     */
    @Test
    void example3() {
        String s = "pwwkew";

        int longestSubstring = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        assertEquals(3, longestSubstring);
    }

    @Test
    void test1() {
        String s = "dvdf";

        int longestSubstring = new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s);

        assertEquals(3, longestSubstring);
    }
}