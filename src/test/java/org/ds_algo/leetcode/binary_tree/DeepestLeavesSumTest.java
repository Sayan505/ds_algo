package org.ds_algo.leetcode.binary_tree;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class DeepestLeavesSumTest {
    DeepestLeavesSum deepestLeavesSum;

    @BeforeEach
    void init() {
        deepestLeavesSum = new DeepestLeavesSum();

        craftInput();
    }

    TreeNode root;
    void craftInput() {
        // Level-Order: root = [1,2,3,4,5,null,6,7,null,null,null,null,8]
        root = new TreeNode(1, new TreeNode(2, new TreeNode(4, new TreeNode(7), null),
                new TreeNode(5)), new TreeNode(3, null, new TreeNode(6, null,
                    new TreeNode(8))));
    }

    @Test
    void test() {
        int actualSum = deepestLeavesSum.deepestLeavesSum(root);
        int expectedSum = 15;

        Assertions.assertEquals(expectedSum, actualSum);
    }
}
