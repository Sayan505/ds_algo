package org.ds_algo.leetcode.binary_tree;


import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;

public class BinarySearchTreeToGreaterSumTreeTest {
    BinarySearchTreeToGreaterSumTree binarySearchTreeToGreaterSumTree;

    @BeforeEach
    void init() {
        binarySearchTreeToGreaterSumTree = new BinarySearchTreeToGreaterSumTree();

        craftInput();
    }

    TreeNode inputRoot;
    void craftInput() {
        // Level-Order: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
        TreeNode l41 = new TreeNode(3);
        TreeNode l42 = new TreeNode(8);
        TreeNode l31 = new TreeNode(0);
        TreeNode l32 = new TreeNode(2, null, l41);
        TreeNode l33 = new TreeNode(5);
        TreeNode l34 = new TreeNode(7, null, l42);
        TreeNode l21 = new TreeNode(1, l31, l32);
        TreeNode l22 = new TreeNode(6, l33, l34);
        TreeNode l11 = new TreeNode(4, l21, l22);

        inputRoot = l11;
    }

    @Test
    void test() {
        TreeNode actualRoot = binarySearchTreeToGreaterSumTree.bstToGst(inputRoot);
        // Level-Order: root = [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
        TreeNode l41 = new TreeNode(33);
        TreeNode l42 = new TreeNode(8);
        TreeNode l31 = new TreeNode(36);
        TreeNode l32 = new TreeNode(35, null, l41);
        TreeNode l33 = new TreeNode(26);
        TreeNode l34 = new TreeNode(15, null, l42);
        TreeNode l21 = new TreeNode(36, l31, l32);
        TreeNode l22 = new TreeNode(21, l33, l34);
        TreeNode l11 = new TreeNode(30, l21, l22);
        TreeNode expectedRoot = l11;

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
