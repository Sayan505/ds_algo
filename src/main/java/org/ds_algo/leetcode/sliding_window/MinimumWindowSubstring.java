package org.ds_algo.leetcode.sliding_window;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> window = new HashMap<Character, Integer>();

        int val = 0;

        for(char c : t.toCharArray()) {
            val = window.get(c) != null ? window.get(c) : 0;
            window.put(c, val + 1);
        }

        int count = t.length();
        int l = 0;
        int r = 0;

        int res_l = 0;
        int res_n = (int) 1e9;

        while(r < s.length()) {
            val = window.get(s.charAt(r)) != null ? window.get(s.charAt(r)) : 0;
            if(val > 0) --count;

            window.put(s.charAt(r++), val - 1);

            while(count == 0) {
                if(r - l < res_n) {
                    res_l = l;
                    res_n = r - l;
                }

                val = window.get(s.charAt(l)) != null ? window.get(s.charAt(l)) : 0;
                window.put(s.charAt(l), ++val);

                if(val > 0) {
                    ++count;
                }

                ++l;
            }
        }

        if(res_n != (int) 1e9) {
            return s.substring(res_l, res_l + res_n);
        }

        return "";
    }
}
