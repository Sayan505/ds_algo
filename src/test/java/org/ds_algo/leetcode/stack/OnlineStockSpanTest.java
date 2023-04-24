package org.ds_algo.leetcode.stack;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;

public class OnlineStockSpanTest {
    static OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @BeforeAll
    static void init() {
        onlineStockSpan = new OnlineStockSpan();
    }

    @Test
    void testCase1() {
        int actual = onlineStockSpan.next(100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCase2() {
        int actual = onlineStockSpan.next(80);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCase3() {
        int actual = onlineStockSpan.next(60);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCase4() {
        int actual = onlineStockSpan.next(70);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCase5() {
        int actual = onlineStockSpan.next(60);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCase6() {
        int actual = onlineStockSpan.next(75);
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testCase7() {
        int actual = onlineStockSpan.next(85);
        int expected = 6;

        Assertions.assertEquals(expected, actual);
    }
}
