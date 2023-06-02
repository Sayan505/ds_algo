package org.ds_algo.leetcode.two_pointers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

public class BoatsToSavePeopleTest {
    BoatsToSavePeople boatsToSavePeople;

    @BeforeEach
    void init() {
        boatsToSavePeople = new BoatsToSavePeople();
    }

    int limit = 5;
    int[] people = { 3, 5, 3, 4 };

    @Test
    void Test() {
        int expected = 4;
        int actual = boatsToSavePeople.numRescueBoats(people, limit);

        Assertions.assertEquals(expected, actual);
    }

}
