package org.ds_algo.leetcode.sliding_window;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;

        HashSet<Character> hash_set = new HashSet<>();

        int l = 0; int r = 0;
        for(; r < s.length(); ++r) {
            // if the value is already in the hash set
            // loop until the value gets removed
            while(hash_set.contains(s.charAt(r))) {
                // and, keep erasing from left till the value (inclusive)
                hash_set.remove(s.charAt(l));
                ++l;    // progress left ptr
            }

            // finally, insert the value (also if it did not exist previously,
            // it'll just insert it without the loop getting run)
            hash_set.add(s.charAt(r));

            // record max length
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
