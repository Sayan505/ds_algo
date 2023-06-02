package org.ds_algo.leetcode.two_pointers;


import java.util.Arrays;

public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        // heaviest + lightest pair possible
        // classic sorted two ptr problem

        int res = 0;

        Arrays.sort(people);

        int l = 0;
        int r = people.length - 1;

        while(l <= r) {
            int w = people[l] + people[r];

            // if they fit
            if(w <= limit) {
                // both will go! prep for next candidate
                --r;
                ++l;
            } else {
                // heaviest will go alone! prep for next heavy candidate
                --r;
            }

            // someone will go regardless
            /* "sum of the weight of those people is at most limit." */
            ++res;
        }

        return res;
    }
}
