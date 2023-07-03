package org.ds_algo.leetcode.sliding_window;

import java.util.HashMap;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        if(n == 0 || n < k) return 0;
        if(k <= 1) return n;

        HashMap<Character, Integer> freq = new HashMap<>();
        for(char c : s.toCharArray()) {
            int val = freq.get(c) != null ? freq.get(c) : 0;
            freq.put(c, val + 1);
        }

        int split = 0;
        while(split < n && freq.get(s.charAt(split)) >= k) ++split;
        if(split >= n - 1) return split;

        int left = longestSubstring(s.substring(0, split), k);
        while(split < n && freq.get(s.charAt(split)) < k) ++split;
        int right = longestSubstring(s.substring(split, n), k);

        return Math.max(left, right);
    }
}
