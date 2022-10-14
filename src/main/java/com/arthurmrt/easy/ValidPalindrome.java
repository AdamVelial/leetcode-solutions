package com.arthurmrt.easy;

// 125. Valid Palindrome
public class ValidPalindrome {

    // second solution
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;


        while (left < right) {
            if ( !Character.isLetterOrDigit(s.charAt(left)) ) {
                left++;
            } else if (!Character.isLetterOrDigit( s.charAt(right)) ) {
                right--;
            } else if ( Character.toLowerCase( s.charAt(left) ) != Character.toLowerCase( s.charAt(right)) ){
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    // first solution
    public boolean isPalindrome_Old(String s) {
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
