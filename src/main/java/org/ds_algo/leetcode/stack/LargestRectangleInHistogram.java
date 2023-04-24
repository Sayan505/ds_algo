package org.ds_algo.leetcode.stack;


import java.util.Stack;

import org.ds_algo.pair.Pair;   // javafx.util.pair replacement

public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        Stack<Pair<Integer, Integer>> nsl = new Stack<Pair<Integer, Integer>>();
        int[] left = new int[n];

        Stack<Pair<Integer, Integer>> nsr = new Stack<Pair<Integer, Integer>>();
        int[] right = new int[n];

        int maxArea = 0;   // (heights[i]) * (right[i] - left[i] - 1)

        // calc NSL
        for(int i = 0; i < n; ++i) {
            if(nsl.isEmpty() == true) left[i] = -1;
            else {
                while(nsl.isEmpty() == false && nsl.peek().getKey() >= heights[i]) {
                    nsl.pop();
                }

                if(nsl.isEmpty() == true) left[i] = -1;
                else {
                    left[i] = nsl.peek().getValue();
                }
            }

            nsl.push(new Pair<Integer, Integer>(heights[i], i));
        }

        // calc NSR
        for(int i = n - 1; i >= 0; --i) {
            if(nsr.isEmpty() == true) right[i] = n;
            else {
                while(nsr.isEmpty() == false && nsr.peek().getKey() >= heights[i]) {
                    nsr.pop();
                }

                if(nsr.isEmpty() == true) right[i] = n;
                else {
                    right[i] = nsr.peek().getValue();
                }
            }

            nsr.push(new Pair<Integer, Integer>(heights[i], i));
        }

        /* now calc area: (heights[i]) * (right[i] - left[i] - 1)
         * and track the max area. */
        for(int i = 0; i < n; ++i) {
            maxArea = Math.max(maxArea, (heights[i]) * (right[i] - left[i] - 1));
        }


        return maxArea;
    }
}
