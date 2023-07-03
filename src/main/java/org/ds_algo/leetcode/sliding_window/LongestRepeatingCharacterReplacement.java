package org.ds_algo.leetcode.sliding_window;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int res = 0;
        int[] freq = new int[26];

        int mx = 0;

        int l = 0;
        int r = 0;

        while(r < s.length()) {
            ++freq[s.charAt(r) - 'A']; // include next char
            mx = Math.max(mx, freq[s.charAt(r) - 'A']); // record max char occurence

            if(r - l + 1 - mx > k) {
                // more than K chars needed to be changed to the most freq char to comply
                // therefore, shrink window

                --freq[s.charAt(l) - 'A']; // de-count freq

                ++l; // shrink window
            }

            // record window size (max)
            res = Math.max(res, r - l + 1);

            // expand window
            ++r;    // next char
        }

        return res;
    }
}
