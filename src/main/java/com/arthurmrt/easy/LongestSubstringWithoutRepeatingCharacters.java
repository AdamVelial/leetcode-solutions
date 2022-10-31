package com.arthurmrt.easy;

import java.util.HashMap;
import java.util.Map;

// 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() < 2) return s.length();

        Map<Character, Integer> map = new HashMap<>();

        int longestSubstring = 0;
        for (int r = 0, l = 0; r <= s.length(); r++) {

            if (r == s.length()) {
                longestSubstring = Math.max(longestSubstring, s.substring(l, r).length());
                break;
            }

            if (map.containsKey(s.charAt(r))) {
                System.out.println(s.substring(l, r));
                longestSubstring = Math.max(longestSubstring, s.substring(l, r).length());
                Integer startSub = map.get(s.charAt(r));
                while (l <= startSub) {
                    map.remove(s.charAt(l));
                    l++;
                }
                map.put(s.charAt(r), r);
            } else {
                map.put(s.charAt(r), r);
            }
        }

        return longestSubstring;
    }
}
