package org.ds_algo.leetcode.sliding_window;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class LongestSubstringWithoutRepeatingCharactersTest {
    LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters;

    @BeforeEach
    void init() {
        longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
    }

    String s = "abcabcbb";

    @Test
    void test() {
        int expected = 3;
        int actual = longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(s);

        Assertions.assertEquals(expected, actual);
    }
}
