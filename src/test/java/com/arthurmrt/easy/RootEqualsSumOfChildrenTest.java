package com.arthurmrt.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RootEqualsSumOfChildrenTest {

    /**
     * Input: root = [10,4,6]
     * Output: true
     * Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
     * 10 is equal to 4 + 6, so we return true.
     */
    @Test
    void checkTreeTest() {
        RootEqualsSumOfChildren.TreeNode treeNode = new RootEqualsSumOfChildren.TreeNode(10);
        treeNode.left = new RootEqualsSumOfChildren.TreeNode(4);
        treeNode.right = new RootEqualsSumOfChildren.TreeNode(6);

        assertTrue(new RootEqualsSumOfChildren().checkTree(treeNode));
    }

    /**
     * Input: root = [5,3,1]
     * Output: false
     * Explanation: The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
     * 5 is not equal to 3 + 1, so we return false.
     */
    @Test
    void checkTreeTest2() {
        RootEqualsSumOfChildren.TreeNode treeNode = new RootEqualsSumOfChildren.TreeNode(5);
        treeNode.left = new RootEqualsSumOfChildren.TreeNode(3);
        treeNode.right = new RootEqualsSumOfChildren.TreeNode(1);

        assertFalse(new RootEqualsSumOfChildren().checkTree(treeNode));
    }
}