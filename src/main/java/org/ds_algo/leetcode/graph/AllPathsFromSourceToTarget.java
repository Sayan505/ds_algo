package org.ds_algo.leetcode.graph;


import java.util.List;
import java.util.ArrayList;

public class AllPathsFromSourceToTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        // current search path
        List<Integer> currPath = new ArrayList<>();

        // collection of all valid paths
        List<List<Integer>> paths = new ArrayList<>();

        int dest = graph.length - 1;    // dest node

        // init dfs
        dfs(currPath, paths, graph, dest, 0);

        return paths;
    }

    private void dfs(List<Integer> currPath, List<List<Integer>> paths,
                     int[][] graph, int dest, int currNode) {
        currPath.add(currNode); // track current path

        // if dest, record current path
        if(currNode == dest) paths.add(new ArrayList<Integer>(currPath));

        // for other nodes in the adjacency list
        for(var child : graph[currNode])
            dfs(currPath, paths, graph, dest, child);

        currPath.remove(currPath.size() - 1);   // remove last (ret)
    }
}
