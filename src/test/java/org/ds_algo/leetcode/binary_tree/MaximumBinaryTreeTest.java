package org.ds_algo.leetcode.binary_tree;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

class MaximumBinaryTreeTest {
    MaximumBinaryTree maximumBinaryTree;

    @BeforeEach
    void init() {
        maximumBinaryTree = new MaximumBinaryTree();

        craftInput();
    }

    int[] nums;
    void craftInput() {
        nums = new int[] { 3, 2, 1, 6, 0, 5 };
    }

    @Test
    void test() {
        TreeNode actualRoot  = maximumBinaryTree.constructMaximumBinaryTree(nums);     // actual
        TreeNode expectedRoot = new TreeNode(6, new TreeNode(3, null, new TreeNode(2, null,
                new TreeNode(1, null, null))), new TreeNode(5,
                    new TreeNode(0, null, null), null));    // expected: [6,3,5,null,2,0,null,null,1]

        ArrayList<Integer> actualPreorder = new ArrayList<Integer>();   // actual
        ArrayList<Integer> expectedPreorder = new ArrayList<Integer>(); // expected

        // calc pre-order traversals of both
        preorder(actualRoot, actualPreorder);       // actual
        preorder(expectedRoot, expectedPreorder);   // expected

        // compare pre-orders
        Assertions.assertEquals(expectedPreorder, actualPreorder);
    }

    void preorder(TreeNode root, ArrayList<Integer> arrayList) {
        if(root == null) return;

        arrayList.add(root.val);
        preorder(root.left, arrayList);
        preorder(root.right, arrayList);
    }
}
