package org.ds_algo.leetcode.binary_tree;


import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        // bfs but just retain the last lvl
        ArrayList<Integer> lvl = new ArrayList<Integer>();

        int sum = 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();

            lvl.clear();

            while(size-- != 0) {
                TreeNode node = q.poll();

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);

                lvl.add(node.val);
            }
        }

        for(int x: lvl)
            sum += x;

        return sum;
    }
}