package org.ds_algo.leetcode.sliding_window;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MinimumWindowSubstringTest {
    MinimumWindowSubstring minimumWindowSubstring;

    @BeforeEach
    void init() {
        minimumWindowSubstring = new MinimumWindowSubstring();
    }

    String s = "ADOBECODEBANC";
    String t = "ABC";

    @Test
    void test() {
        String expected = "BANC";
        String actual = minimumWindowSubstring.minWindow(s, t);

        Assertions.assertEquals(expected, actual);
    }
}
