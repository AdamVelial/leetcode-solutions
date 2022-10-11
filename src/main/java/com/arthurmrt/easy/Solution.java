package com.arthurmrt.easy;

import java.util.HashSet;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        //char[] chars = {'s', 'd', 'h', 'a', 'a', 'h', 'a'};
        char[] chars = "xyzzaz".toCharArray();


        int start = 0, k = 3;
        LinkedList<Character> window = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            window.addLast(chars[i]);
            if (i - start + 1 == k) {
                if (new HashSet<Character>(window).size() == k) {
                    System.out.printf("%d:%d", start, i);
                    System.out.println(window);
                }
                window.removeFirst();
                start += 1;
            }
        }
    }
}
