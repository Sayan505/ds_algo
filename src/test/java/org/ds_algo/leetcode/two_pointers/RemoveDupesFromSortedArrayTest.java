package org.ds_algo.leetcode.two_pointers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoveDupesFromSortedArrayTest {
    RemoveDupesFromSortedArray removeDupesFromSortedArray;

    @BeforeEach
    void init() {
        removeDupesFromSortedArray = new RemoveDupesFromSortedArray();
    }

    int[] nums =  { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };

    @Test
    void Test() {
        int expected = 5;
        int actual = removeDupesFromSortedArray.removeDuplicates(nums);

        Assertions.assertEquals(expected, actual);
    }
}
