package org.ds_algo.leetcode.graph;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllPathsFromSourceToTargetTest {
    AllPathsFromSourceToTarget allPathsFromSourceToTarget;

    @BeforeEach
    void init() {
        allPathsFromSourceToTarget = new AllPathsFromSourceToTarget();
    }

    // craft input
    int[][] graph = { { 1, 2 }, { 3 }, { 3 }, { } };

    @Test
    void test() {
        List<List<Integer>> actual = allPathsFromSourceToTarget.allPathsSourceTarget(graph);

        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(0, 1, 3));
        expected.add(Arrays.asList(0, 2, 3));

        Assertions.assertEquals(expected, actual);
    }


}
