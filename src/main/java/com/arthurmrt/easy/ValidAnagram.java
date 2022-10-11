package com.arthurmrt.easy;

import java.util.List;
import java.util.stream.Collectors;

// 242. Valid Anagram
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        List<Character> sCharacters = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.toList());


        for (int i = 0; i < t.length(); i++) {
            if (sCharacters.contains(t.charAt(i))) {
                sCharacters.remove(Character.valueOf(t.charAt(i)));
            } else {
                return false;
            }
        }

        return sCharacters.size() == 0;
    }
}
