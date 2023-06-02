package org.ds_algo.leetcode.two_pointers;

public class ReverseVowelsOfAString {
    boolean isVowel(char x) {
        if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' ||
                x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U') {
            return true;
        }

        return false;
    }

    public String reverseVowels(String s) {
        int j = s.length();
        int i = 0;

        StringBuilder str = new StringBuilder(s);

        while(i < j) {
            if(isVowel(str.charAt(i))) {
                // skip over non-vowels
                while(!isVowel(str.charAt(--j))) { }

                // swap
                char x = str.charAt(i);
                char y = str.charAt(j);
                str.setCharAt(i, y);
                str.setCharAt(j, x);
            }

            ++i;
        }

        return str.toString();
    }
}
