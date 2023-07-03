package org.ds_algo.leetcode.sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

class MaximumAverageSubArrayITest {
    MaximumAverageSubArrayI maximumAverageSubArrayI;

    @BeforeEach
    void init() {
        maximumAverageSubArrayI = new MaximumAverageSubArrayI();
    }

    int[] nums = { 1, 12, -5, -6, 50, 3 };
    int k = 4;

    @Test
    void test() {
        double expected = 12.75000;
        double actual = maximumAverageSubArrayI.findMaxAverage(nums, k);

        Assertions.assertEquals(expected, actual);
    }
}
