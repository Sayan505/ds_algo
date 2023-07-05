package org.ds_algo.leetcode.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxConsecutiveOnesIIITest {
    MaxConsecutiveOnesIII maxConsecutiveOnesIII;

    @BeforeEach
    void init() {
        maxConsecutiveOnesIII = new MaxConsecutiveOnesIII();
    }

    @Test
    void test() {
        int[] nums = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;

        int expected = 6;
        int actual = maxConsecutiveOnesIII.longestOnes(nums, k);

        Assertions.assertEquals(expected, actual);

    }
}
