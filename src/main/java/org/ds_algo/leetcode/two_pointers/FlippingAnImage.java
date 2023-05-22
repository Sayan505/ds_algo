package org.ds_algo.leetcode.two_pointers;


class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[] row : image) {
            // for each row

            int l = 0, r = row.length - 1;

            while(l <= r) {
                if(l == r) row[l] = row[l] ^ 1;  // just invert
                else {
                    // swap and invert

                    int temp = row[l];
                    row[l] = row[r] ^ 1;
                    row[r] = temp ^ 1;
                }

                ++l;
                --r;
            }
        }

        return image;
    }
}
