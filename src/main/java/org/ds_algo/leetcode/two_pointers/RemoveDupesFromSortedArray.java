package org.ds_algo.leetcode.two_pointers;


public class RemoveDupesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;  // insertion index

        for(int i = 1; i < nums.length; ++i) {
            if(nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                ++k;
            }
        }

        return k;
    }
}
