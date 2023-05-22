package org.ds_algo.leetcode.two_pointers;


class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();    // is StringBuilder faster?

        int i = 0;

        while(i < word1.length() || i < word2.length()) {
            if(i < word1.length())
                res.append(word1.charAt(i));

            if(i < word2.length())
                res.append(word2.charAt(i));

            ++i;
        }

        return res.toString();
    }
}
