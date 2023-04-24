package org.ds_algo.leetcode.stack;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class MaximalRectangleTest {
    MaximalRectangle maximalRectangle;

    @BeforeEach
    void init() {
        maximalRectangle = new MaximalRectangle();
    }

    // craft input
    char[][] matrix = {
                       { '1', '0', '1', '0', '0' },
                       { '1', '0', '1', '1', '1' },
                       { '1', '1', '1', '1', '1' },
                       { '1', '0', '0', '1', '0' }
                     };


    @Test
    void test() {
        int actual = maximalRectangle.maximalRectangle(matrix);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}
