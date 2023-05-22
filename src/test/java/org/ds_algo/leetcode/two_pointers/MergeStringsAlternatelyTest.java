package org.ds_algo.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class MergeStringsAlternatelyTest {
    MergeStringsAlternately mergeStringsAlternately;

    @BeforeEach
    void init() {
        mergeStringsAlternately = new MergeStringsAlternately();
    }

    String word1 = "abc";
    String word2 = "pqr";

    @Test
    void Test() {
        String expected = "apbqcr";
        String actual = mergeStringsAlternately.mergeAlternately(word1, word2);

        Assertions.assertEquals(expected, actual);
    }

}
