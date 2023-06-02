package org.ds_algo.leetcode.two_pointers;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class ValidPalindromeTest {
    ValidPalindrome validPalindrome;

    @BeforeEach
    void init() {
        validPalindrome = new ValidPalindrome();
    }

    String s = "A man, a plan, a canal: Panama";

    @Test
    void Test() {
        boolean expected = true;
        boolean actual = validPalindrome.isPalindrome(s);

        Assertions.assertEquals(expected, actual);
    }
}
