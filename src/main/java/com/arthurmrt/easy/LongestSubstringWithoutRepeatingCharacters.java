package com.arthurmrt.easy;

import java.util.HashSet;
import java.util.Set;

// 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();

        Set<Character> set = new HashSet<>();

        int longestSubstring = 0;
        int r = 0;
        int l = 0;
        while (r < s.length()) {

            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            longestSubstring = Math.max(longestSubstring, r - l + 1);
            set.add(s.charAt(r));
            r++;
        }

        return longestSubstring;
    }
}
