package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SubstringsOfSizeThreeWithDistinctCharactersTest {

    /**
     * Example 1:
     * <p>
     * Input: s = "xyzzaz"
     * Output: 1
     * Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
     * The only good substring of length 3 is "xyz".
     * Example 2:
     */
    @Test
    void name1() {
        SubstringsOfSizeThreeWithDistinctCharacters sw = new SubstringsOfSizeThreeWithDistinctCharacters();
        int count = sw.countGoodSubstrings("xyzzaz");
        assertEquals(1, count);
    }

    /*
     * Input: s = "aababcabc"
     * Output: 4
     * Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
     * The good substrings are "abc", "bca", "cab", and "abc".
     */
    @Test
    void name2() {
        SubstringsOfSizeThreeWithDistinctCharacters sw = new SubstringsOfSizeThreeWithDistinctCharacters();
        int count = sw.countGoodSubstrings("aababcabc");
        assertEquals(4, count);
    }
}