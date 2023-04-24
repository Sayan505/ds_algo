package org.ds_algo.leetcode.stack;


public class MaximalRectangle {
    // sub-problem: https://leetcode.com/problems/largest-rectangle-in-histogram/
    LargestRectangleInHistogram largestRectangleInHistogram = new LargestRectangleInHistogram();

    public int maximalRectangle(char[][] matrix) {
        int maxArea = 0;

        int n = matrix.length;
        int m = matrix[0].length;
        int[] height = new int[m];

        // conv. matrix to histogram
        for(int i = 0; i < n; ++i) {
            for(int j = 0; j < m; ++j) {
                if(matrix[i][j] == '1') ++height[j];
                else height[j] = 0;
            }

            int area = largestRectangleInHistogram.largestRectangleArea(height);
            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
