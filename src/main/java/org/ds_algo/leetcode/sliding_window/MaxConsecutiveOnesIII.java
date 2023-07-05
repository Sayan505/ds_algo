package org.ds_algo.leetcode.sliding_window;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int res = 0;

        int l = 0;
        int r = 0;

        while(r < nums.length) {
            k -= 1 - nums[r];

            if(k < 0) k += 1 - nums[l++];
            else res = Math.max(res, r - l + 1);

            ++r;
        }

        return res;
    }
}
