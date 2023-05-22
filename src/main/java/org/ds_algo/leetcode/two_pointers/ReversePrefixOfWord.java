package org.ds_algo.leetcode.two_pointers;


class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        int idx = 0;

        for(int i = 0; i < word.length(); ++i) {
            if(word.charAt(i) == ch) {
                idx = i;
                break;
            }
        }

        // reverse [0, idx]
        word = rev(word, idx);

        return word;
    }

    String rev(String str, int idx) {
        StringBuilder buffer = new StringBuilder(str);

        // two ptrs
        int l = 0, r = idx;

        while(l <= r) {
            char temp = buffer.charAt(l);
            buffer.setCharAt(l, buffer.charAt(r));
            buffer.setCharAt(r, temp);

            ++l;
            --r;
        }

        return buffer.toString();
    }
}
