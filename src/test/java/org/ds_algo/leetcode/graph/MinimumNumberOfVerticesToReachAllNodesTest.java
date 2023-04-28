package org.ds_algo.leetcode.graph;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodesTest {
    MinimumNumberOfVerticesToReachAllNodes minimumNumberOfVerticesToReachAllNodes;

    @BeforeEach
    void init() {
        minimumNumberOfVerticesToReachAllNodes = new MinimumNumberOfVerticesToReachAllNodes();
    }

    // craft input
    int n = 6;
    int[][] edges = { { 0, 1 }, { 0, 2 }, { 2, 5 }, { 3, 4 }, { 4, 2 } };

    @Test
    void test() {
        List<Integer> actual = minimumNumberOfVerticesToReachAllNodes.findSmallestSetOfVertices(n, edges);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(0, 3));

        Assertions.assertEquals(expected, actual);
    }
}
