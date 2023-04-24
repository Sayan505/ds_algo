package org.ds_algo.leetcode.binary_tree;


public class FlattenBinaryTree {
    TreeNode prev = null;

    // reverse post-order
    public void flatten(TreeNode root) {
        if(root == null) return;

        flatten(root.right);    // start from rightmost
        flatten(root.left);     // handle left

        /*  flatten  */

        root.right = prev;  // connect to previously handled node
        root.left = null;

        // update the previously handled node which is the current node
        prev = root;
    }
}
