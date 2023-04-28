package org.ds_algo.leetcode.graph;


import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, int[][] edges) {
        ArrayList<Integer> res = new ArrayList<>();   // res: nodes w/ in-degree = zero.
        ArrayList<Boolean> seen = new ArrayList<>(Arrays.asList(new Boolean[n]));  // visited nodes

        // record outdegrees
        for(var node : edges) {
            seen.set(node[1], true);
        }

        // search for nodes with no outdegree
        for(int i = 0; i < n; ++i) {
            if(seen.get(i) == null) res.add(i);
        }

        return res;
    }
}
