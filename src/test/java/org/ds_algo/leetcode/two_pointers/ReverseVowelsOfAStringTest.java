package org.ds_algo.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class ReverseVowelsOfAStringTest {
    ReverseVowelsOfAString reverseVowelsOfAString;

    @BeforeEach
    void init() {
        reverseVowelsOfAString = new ReverseVowelsOfAString();
    }

    String s = "leetcode";

    @Test
    void Test() {
        String expected = "leotcede";
        String actual = reverseVowelsOfAString.reverseVowels(s);

        Assertions.assertEquals(expected, actual);
    }
}
