package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalValueOfVariableAfterPerformingOperationsTest {


    /**
     * Input: operations = ["--X","X++","X++"]
     * Output: 1
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * --X: X is decremented by 1, X =  0 - 1 = -1.
     * X++: X is incremented by 1, X = -1 + 1 =  0.
     * X++: X is incremented by 1, X =  0 + 1 =  1.
     */
    @Test
    void finalValueAfterOperations1() {
        String[] strings = {"--X", "X++", "X++"};
        FinalValueOfVariableAfterPerformingOperations operations = new FinalValueOfVariableAfterPerformingOperations();
        int afterOperations = operations.finalValueAfterOperations(strings);

        assertEquals(1, afterOperations);
    }

    /**
     * Input: operations = ["++X","++X","X++"]
     * Output: 3
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * ++X: X is incremented by 1, X = 0 + 1 = 1.
     * ++X: X is incremented by 1, X = 1 + 1 = 2.
     * X++: X is incremented by 1, X = 2 + 1 = 3.
     */
    @Test
    void finalValueAfterOperations2() {
    }

    /**
     * Input: operations = ["X++","++X","--X","X--"]
     * Output: 0
     * Explanation: The operations are performed as follows:
     * Initially, X = 0.
     * X++: X is incremented by 1, X = 0 + 1 = 1.
     * ++X: X is incremented by 1, X = 1 + 1 = 2.
     * --X: X is decremented by 1, X = 2 - 1 = 1.
     * X--: X is decremented by 1, X = 1 - 1 = 0.
     */
    @Test
    void finalValueAfterOperations3() {
    }

}