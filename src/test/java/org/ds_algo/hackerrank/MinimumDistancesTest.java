package org.ds_algo.hackerrank;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumDistancesTest {
    MinimumDistances minimumDistances;

    @BeforeEach
    void init() {
        minimumDistances = new MinimumDistances();

        craftInput();
    }

    List<Integer> input;
    void craftInput() {
        input = new ArrayList<Integer>();

        input.addAll(Arrays.asList(7, 1, 3, 4, 1, 7));
    }

    @Test
    void test() {
        int expected = 3;
        int actual = minimumDistances.minimumDistances(input);

        Assertions.assertEquals(expected, actual);
    }
}
