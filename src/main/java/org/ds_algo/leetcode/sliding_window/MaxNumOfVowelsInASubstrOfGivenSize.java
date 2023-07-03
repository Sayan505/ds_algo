package org.ds_algo.leetcode.sliding_window;

public class MaxNumOfVowelsInASubstrOfGivenSize {
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public int maxVowels(String s, int k) {
        int count = 0, max = 0;

        int l = 0, r = 0;

        // first window
        while(k-- > 0) {
            if(isVowel(s.charAt(r++))) ++count;
        }

        max = count;

        // other windows

        while(r < s.length()) {
            if(isVowel(s.charAt(r))) ++count;
            if(isVowel(s.charAt(l))) --count;

            max = Math.max(max, count);

            ++l;
            ++r;
        }

        return max;
    }
}
