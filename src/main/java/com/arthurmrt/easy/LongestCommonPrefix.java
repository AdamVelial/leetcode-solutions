package com.arthurmrt.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//14. Longest Common Prefix
public class LongestCommonPrefix {

    public String getPrefix(List<String> words) {
        LinkedList<Character> prefix = new LinkedList<>();

        int minWordSize = words.get(0).length();
        for (String word : words) {
            minWordSize = minWordSize < word.length() ? minWordSize : word.length();
        }

        for (int i = 0; i < minWordSize; i++) {
            char p = 0;
            for (int j = 0; j < words.size(); j++) {
                char c = words.get(j).toCharArray()[i];
                if (p == 0) {
                    p = c;
                } else if (c != p) {
                    return convert(prefix);
                }
            }
            prefix.add(p);
        }

        return convert(prefix);
    }

    private String convert(LinkedList<Character> prefix) {
        StringBuilder builder = new StringBuilder();
        for (Character c: prefix){
            builder.append(c);
        }
        return builder.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
