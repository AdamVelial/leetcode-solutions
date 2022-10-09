package com.arthurmrt.easy;

//1876. Substrings of Size Three with Distinct Characters
public class SubstringsOfSizeThreeWithDistinctCharacters {

    // "abc", "bca", "cab", and "abc".
    public int countGoodSubstrings(String s) {
        int k = 3, answer = 0;
        for (int i = 0; i < s.length() - (k - 1); i++) {
            System.out.printf("%d:%d ", i, i + k);
            System.out.println(s.substring(i, i + k));
            if (isUnique(s.substring(i, i + k))) answer += 1;
        }
        return answer;
    }

    private boolean isUnique(String substring) {
        return substring.chars()
                .distinct()
                .count() == 3;
    }
}
