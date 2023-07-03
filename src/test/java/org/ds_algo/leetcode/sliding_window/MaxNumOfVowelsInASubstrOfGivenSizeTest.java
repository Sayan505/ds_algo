package org.ds_algo.leetcode.sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class MaxNumOfVowelsInASubstrOfGivenSizeTest {
    MaxNumOfVowelsInASubstrOfGivenSize maxNumOfVowelsInASubstrOfGivenSize;

    @BeforeEach
    void init() {
        maxNumOfVowelsInASubstrOfGivenSize = new MaxNumOfVowelsInASubstrOfGivenSize();
    }

    String s = "abciiidef";
    int k = 3;

    @Test
    void test() {
        int expected = 3;
        int actual = maxNumOfVowelsInASubstrOfGivenSize.maxVowels(s, k);

        Assertions.assertEquals(expected, actual);
    }
}
