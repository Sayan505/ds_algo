package org.ds_algo.leetcode.graph;


import java.util.HashSet;
import java.util.List;

public class KeysAndRooms {
    public boolean canVisitAllRooms(int[][] rooms) {
        HashSet<Integer> visited = new HashSet<>(); // memo

        dfs(rooms, visited, 0);

        return visited.size() == rooms.length;
    }

    void dfs(int[][] rooms,  HashSet<Integer> visited, int currRoom) {
        // track visit
        visited.add(currRoom);

        for(var child : rooms[currRoom])
            if(!visited.contains(child))
                dfs(rooms, visited, child); // visit if not already visited
    }
}

