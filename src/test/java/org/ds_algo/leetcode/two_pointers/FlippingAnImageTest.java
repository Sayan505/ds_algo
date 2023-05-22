package org.ds_algo.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;    // deepEquals()

public class FlippingAnImageTest {
    FlippingAnImage flippingAnImage;

    @BeforeEach
    void init() {
        flippingAnImage = new FlippingAnImage();
    }

    int[][] image = {
                      { 1, 1, 0, 0 },
                      { 1, 0, 0, 1 },
                      { 0, 1, 1, 1 },
                      { 1, 0, 1, 0 }
                    };

    @Test
    void Test() {
        int[][] expected = {
                             { 1, 1, 0, 0 },
                             { 0, 1, 1, 0 },
                             { 0, 0, 0, 1 },
                             { 1, 0, 1, 0 }
                           };

        int[][] actual = flippingAnImage.flipAndInvertImage((image));

        Assertions.assertTrue(Arrays.deepEquals(expected, actual));
    }
}
