package org.ds_algo.leetcode.binary_tree;

public class BinarySearchTreeToGreaterSumTree {
    int sum = 0;

    // reverse in-order
    public void dfs(TreeNode root) {
        if(root == null) return;

        dfs(root.right);
        root.val = sum += root.val; // add then store
        dfs(root.left);
    }

    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }
}