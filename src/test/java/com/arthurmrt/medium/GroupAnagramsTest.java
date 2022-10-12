package com.arthurmrt.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupAnagramsTest {

    /**
     * Example 1
     * <p>
     * Input: strs = ["eat","tea","tan","ate","nat","bat"]
     * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    @Test
    void example1() {
        String[] strs = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> expected = Arrays.asList(Arrays.asList("bat"), Arrays.asList("nat", "tan"), Arrays.asList("ate", "eat", "tea"));

        List<List<String>> result = new GroupAnagrams().groupAnagrams(strs);

        assertEquals(expected.size(), result.size());

        expected = deepSort(expected);
        result = deepSort(result);


        assertEquals(expected, result);
    }

    /**
     * Example 2
     * <p>
     * Input: strs = [""]
     * Output: [[""]]
     */
    @Test
    void example2() {
        String[] strs = new String[]{""};
        List<List<String>> expected = Arrays.asList(Arrays.asList(""));

        List<List<String>> result = new GroupAnagrams().groupAnagrams(strs);

        assertEquals(result.size(), expected.size());


        expected = deepSort(expected);
        result = deepSort(result);


        assertEquals(expected, result);
    }

    /**
     * Example 3
     * <p>
     * Input: strs = ["a"]
     * Output: [["a"]]
     */
    @Test
    void example3() {
        String[] strs = new String[]{"a"};

        List<List<String>> expected = Arrays.asList(Arrays.asList("a"));

        List<List<String>> result = new GroupAnagrams().groupAnagrams(strs);

        assertEquals(expected.size(), result.size());


        expected = deepSort(expected);
        result = deepSort(result);


        assertEquals(expected, result);
    }

    private List<List<String>> deepSort(List<List<String>> expected) {
        expected = expected.stream()
                .peek(list -> list.sort(String::compareTo))
                .sorted(new Comparator<List<String>>() {
                    @Override
                    public int compare(List<String> o1, List<String> o2) {
                        return Integer.compare(o1.size(), o2.size());
                    }
                })
                .toList();
        return expected;
    }
}