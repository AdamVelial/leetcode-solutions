package com.arthurmrt.easy;

// 125. Valid Palindrome
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String str = s.trim().replaceAll("[^A-Za-z0-9]","").toLowerCase();
        if (str.isEmpty()) return true;

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) return false;

            left  += 1;
            right -= 1;
        }

        return true;
    }
}
