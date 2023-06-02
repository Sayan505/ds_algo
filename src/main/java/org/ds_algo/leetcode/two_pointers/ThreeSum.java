package org.ds_algo.leetcode.two_pointers;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        HashSet<List<Integer>> uniqTriplets =  new HashSet<List<Integer>>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        for(int i = 0; i < nums.length - 2; ++i) {
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r) {
                if(nums[i] + nums[l] + nums[r] == 0) {
                    uniqTriplets.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    ++l;
                    --r;
                } else if(nums[i] + nums[l] + nums[r] < 0) {
                    ++l;
                } else {
                    --r;
                }
            }
        }

        for(var x: uniqTriplets) {
            res.add(x);
        }

        return res;
    }
}
