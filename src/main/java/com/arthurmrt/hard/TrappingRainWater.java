package com.arthurmrt.hard;

// 42. Trapping Rain Water
public class TrappingRainWater {
    public int trap(int[] height) {
        int amountOfWater = 0;

        int maxIndx = 0;

        int pointer = 0;

        while (pointer < height.length) {

            if (height[pointer] > height[maxIndx]) {

                int groundLevel = Math.min(height[pointer], height[maxIndx]);
                for (int i = pointer; i > maxIndx; i--) {
                    if (height[i] < groundLevel) {
                        int water = groundLevel - height[i];
                        System.out.printf("index: %d, level: %d, height: %d, water: %d %n", i, groundLevel, height[i], water);
                        amountOfWater += water;
                    }
                }

                maxIndx = pointer;
            }

            pointer++;
        }

        return amountOfWater;
    }
}
