package org.ds_algo.leetcode.sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class LongestRepeatingCharacterReplacementTest {
    LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement;

    @BeforeEach
    void init() {
        longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
    }

    String s = "AABABBA";
    int k = 1;

    @Test
    void test() {
        int expected = 4;
        int actual = longestRepeatingCharacterReplacement.characterReplacement(s, k);

        Assertions.assertEquals(expected, actual);
    }
}
