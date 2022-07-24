package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsAndStonesTest {

    /**
     * Example 1:
     *
     * Input: jewels = "aA", stones = "aAAbbbb"
     * Output: 3
     */
    @Test
    void jewelsTest1() {
        JewelsAndStones js = new JewelsAndStones();
        String jewels = "aA";
        String stones = "aAAbbbb";

        assertEquals(3, js.jewels(jewels, stones));
    }

    /**
     * Example 2:
     *
     * Input: jewels = "z", stones = "ZZ"
     * Output: 0
     */
    @Test
    void jewelsTest2() {
        JewelsAndStones js = new JewelsAndStones();
        String jewels = "z";
        String stones = "ZZ";

        assertEquals(0, js.jewels(jewels, stones));
    }
}