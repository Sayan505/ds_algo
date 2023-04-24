package org.ds_algo.leetcode.stack;


import java.util.Stack;

import org.ds_algo.pair.Pair;   // javafx.util.pair replacement

public class OnlineStockSpan {
    Stack<Pair<Integer, Integer>> s;
    int idx;

    public OnlineStockSpan() {
        idx = 0;
        s = new Stack<Pair<Integer, Integer>>();

    }

    public int next(int price) {
        int res = 0;

        ++idx;

        if(s.isEmpty()) res = 1;
        else {
            while(!s.isEmpty() && s.peek().getKey() <= price) s.pop();
            if(s.isEmpty()) res = idx;
            else res = idx - s.peek().getValue();
        }

        s.push(new Pair<Integer, Integer>(price, idx));

        return res;
    }
}
