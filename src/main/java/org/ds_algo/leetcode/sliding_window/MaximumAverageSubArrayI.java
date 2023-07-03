package org.ds_algo.leetcode.sliding_window;


class MaximumAverageSubArrayI {
    public double findMaxAverage(int[] nums, int k) {
        double res = -1e4;
        int w = k;

        int l = 0;
        int r = 0;

        int x = 0;

        // first window
        while(w-- > 0) {
            x += nums[r++];
        }
        res = Math.max(res, (double) x / k);

        // other windows
        while(r < nums.length) {
            x += nums[r++];
            x -= nums[l++];

            res = Math.max(res, (double) x / k);
        }

        return res;
    }
}
