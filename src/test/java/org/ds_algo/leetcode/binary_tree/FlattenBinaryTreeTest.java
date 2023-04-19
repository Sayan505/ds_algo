package org.ds_algo.leetcode.binary_tree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class FlattenBinaryTreeTest {
    FlattenBinaryTree flattenBinaryTree;

    @BeforeEach
    void init() {
        flattenBinaryTree = new FlattenBinaryTree();

        craftInput();
    }

    TreeNode inputRoot;
    void craftInput() {
        // Level-Order: root = [1,2,5,3,4,null,6]
        inputRoot = new TreeNode(1, new TreeNode(2, new TreeNode(3), new TreeNode(4)), new TreeNode(5, null, new TreeNode(6)));
    }

    @Test
    void test() {
        flattenBinaryTree.flatten(inputRoot);
        TreeNode actualRoot = inputRoot;
        // Level-Order: root = [1,null,2,null,3,null,4,null,5,null,6]

        TreeNode expectedRoot = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, new TreeNode(5, null, new TreeNode(6))))));

        ArrayList<Integer> actualPreorder = new ArrayList<Integer>();   // actual
        ArrayList<Integer> expectedPreorder = new ArrayList<Integer>(); // expected

        // calc pre-order traversals of both
        preorder(actualRoot, actualPreorder);       // actual
        preorder(expectedRoot, expectedPreorder);   // expected

        // compare pre-orders
        Assertions.assertEquals(actualPreorder, expectedPreorder);
    }

    void preorder(TreeNode root, ArrayList<Integer> arrayList) {
        if(root == null) return;

        arrayList.add(root.val);
        preorder(root.left, arrayList);
        preorder(root.right, arrayList);
    }
}
