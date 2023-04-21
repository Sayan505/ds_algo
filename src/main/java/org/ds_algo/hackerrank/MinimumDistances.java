package org.ds_algo.hackerrank;


import java.util.List;
import java.util.HashMap;

public class MinimumDistances {
    public int minimumDistances(List<Integer> a) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int currDist = -1;
        int minDist = a.size();

        for(int i = 0; i < a.size(); ++i) {
            if(map.containsKey(a.get(i))) {
                currDist = i - map.get(a.get(i));
                minDist = Math.min(currDist, minDist);
            } else {
                // put it into the HashMap
                map.put(a.get(i), i);
            }
        }

        return minDist == a.size() ? -1 : minDist;
    }
}
