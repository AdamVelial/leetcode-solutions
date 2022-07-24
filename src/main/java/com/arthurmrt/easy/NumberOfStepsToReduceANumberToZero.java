package com.arthurmrt.easy;

//1342. Number of Steps to Reduce a Number to Zero
public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps(int num) {
        int steps = 0;

        while(num > 0) {
            steps++;

            if((num % 2) == 0) {
                num /= 2;
            } else {
                num--;
            }
        }

        return steps;
    }

    public static void main(String[] args) {
        byte b = 4;
        System.out.println( b << 2 );
    }
}
