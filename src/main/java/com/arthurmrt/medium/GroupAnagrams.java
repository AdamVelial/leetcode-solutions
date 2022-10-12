package com.arthurmrt.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// 49. Group Anagrams
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = Arrays.stream(strs)
                .map(String::toCharArray)
                .peek(a -> Arrays.sort(a))
                .collect(Collectors.toMap(
                        chars -> String.valueOf(chars),
                        chars -> new ArrayList<String>(),
                        (chars1, chars2) -> chars1
                ));

        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            List<String> words = map.get(String.valueOf(chars));
            words.add(str);
        }

        return new ArrayList<>(map.values());
    }
}
