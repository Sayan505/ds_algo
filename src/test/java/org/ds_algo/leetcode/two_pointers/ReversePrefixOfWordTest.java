package org.ds_algo.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class ReversePrefixOfWordTest {
    ReversePrefixOfWord reversePrefixOfWord;

    @BeforeEach
    void init() {
        reversePrefixOfWord = new ReversePrefixOfWord();
    }

    String word = "abcdefd";
    char ch = 'd';

    @Test
    void Test() {
        String expected = "dcbaefd";
        String actual = reversePrefixOfWord.reversePrefix(word, ch);

        Assertions.assertEquals(expected, actual);
    }
}
