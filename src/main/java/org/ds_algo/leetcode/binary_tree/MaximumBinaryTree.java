package org.ds_algo.leetcode.binary_tree;

class MaximumBinaryTree {
    int maxIndex(int[] nums, int l, int r) {
        int maxVal = 0;
        int maxIdx = 0;

        for(; l <= r; ++l) {
            if(nums[l] > maxVal) {
                maxVal = nums[l];
                maxIdx = l;
            }
        }

        return maxIdx;
    }

    TreeNode preorder(int[] nums, int l, int r) {
        if(l > r) return null;
        if(l == r) return new TreeNode(nums[l]);

        int maxIdx = maxIndex(nums, l, r);  // find max element in the given range

        TreeNode root = new TreeNode(nums[maxIdx]); // gen root on max val in range
        root.left = preorder(nums, l, maxIdx - 1);  // handle left
        root.right = preorder(nums, maxIdx + 1, r); // handle right

        return root;
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return preorder(nums, 0, nums.length - 1);
    }
}
