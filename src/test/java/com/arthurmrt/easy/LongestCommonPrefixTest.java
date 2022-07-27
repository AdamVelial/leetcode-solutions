package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    /**
     * Example 1:
     *
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     *
     **/
    @Test
    void test1() {
//        List<String> list = Arrays.asList("flower", "flow", "flight");
//        String longestCommonPrefix = new LongestCommonPrefix().getPrefix(list);
//        assertEquals(longestCommonPrefix, "fl");
        String s = new LongestCommonPrefix().longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals(s, "fl");

    }

    /**
     *  Example 2:
     *     Input: strs = ["dog","racecar","car"]
     *     Output: ""
     *     Explanation: There is no common prefix among the input strings.
     */
    @Test
    void test2() {
        List<String> list = Arrays.asList("dog","racecar","car");
        String longestCommonPrefix = new LongestCommonPrefix().getPrefix(list);
        assertEquals(longestCommonPrefix, "");
    }
}