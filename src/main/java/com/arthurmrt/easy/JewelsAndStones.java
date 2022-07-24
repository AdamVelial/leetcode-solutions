package com.arthurmrt.easy;

import java.util.Arrays;
import java.util.HashSet;

    //771. Jewels and Stones
public class JewelsAndStones {

    //how many of the stones you have are also jewels.
    public int jewels(String jewels, String stones) {
        boolean[] valuableStones = new boolean[67]; //122 - 55

        for (int i = 0; i < jewels.length(); i++) {
            valuableStones[jewels.charAt(i) - 'A'] = true;
        }

        int count = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (valuableStones[stones.charAt(i) - 'A'])
                count++;
        }
        return count;
    }

    public int jewels2(String jewels, String stones) {
        HashSet<Character> set = new HashSet<Character>();

        for (Character ch : jewels.toCharArray()) {
            set.add(ch);
        }

        int count = 0;
        for (Character ch: stones.toCharArray()) {
            if (set.contains(ch)) count++;
        }
        jewels.indexOf('c');

        return count;
    }
}
