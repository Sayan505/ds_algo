package org.ds_algo.leetcode.two_pointers;

public class ValidPalindrome {
    boolean isAlNum(char c) {
        if(c >= 'A' && c <= 'Z') {
            return true;
        } else if(c >= 'a' && c <= 'z') {
            return true;
        } else if(c >= '0' && c <= '9') {
            return true;
        }

        return false;
    }

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while(l < r) {
            // skip over symbols
            while(l < s.length() && !isAlNum(s.charAt(l))) ++l;
            while(r >= 0 && !isAlNum(s.charAt(r))) --r;

            // check if limits are still valid
            if(l >= r) break;

            // compare
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;

            // next char
            ++l;
            --r;
        }

        return true;
    }
}
