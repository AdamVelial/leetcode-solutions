package com.arthurmrt.easy;

//2011. Final Value of Variable After Performing Operations
public class FinalValueOfVariableAfterPerformingOperations {

    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(int i = 0; i < operations.length; i++){
            x = operations[i].charAt(1) == '+' ? x++ : x--;
        }
        return x;
    }
}
