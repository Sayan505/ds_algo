package org.ds_algo.leetcode.sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class LongestSubstringWithAtLeastKRepeatingCharactersTest {
    LongestSubstringWithAtLeastKRepeatingCharacters longestSubstringWithAtLeastKRepeatingCharacters;

    @BeforeEach
    void init() {
        longestSubstringWithAtLeastKRepeatingCharacters = new LongestSubstringWithAtLeastKRepeatingCharacters();
    }

    String s = "ababbc";
    int k = 2;

    @Test
    void test() {
        int expected = 5;
        int actual = longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring(s, k);

        Assertions.assertEquals(expected, actual);
    }
}
