package org.ds_algo.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ThreeSumTest {
    ThreeSum threeSum;

    @BeforeEach
    void init() {
        threeSum = new ThreeSum();
    }

    int[] nums = { -1, 0, 1, 2, -1, -4 };

    @Test
    void Test() {
        int[][] expected = { { -1, -1, 2 }, { -1, 0, 1 } };

        List<List<Integer>> actualList = threeSum.threeSum(nums);
        int[][] actual = new int[2][3];
        for(int i = 0; i < 2; ++i) {
            for(int j = 0; j < 3; ++j) {
                actual[i][j] = actualList.get(i).get(j);
            }
        }


        Assertions.assertTrue(Arrays.deepEquals(expected, actual));
    }
}
