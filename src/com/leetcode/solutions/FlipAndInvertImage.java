package com.leetcode.solutions;

public class FlipAndInvertImage {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++)
                image[i][j] = image[i][j] + image[i][n - 1 - j] - (image[i][n - 1 - j] = image[i][j]);
            for(int j = 0; j < n; j++)
                image[i][j] = (image[i][j] == 0) ? 1 : 0;
        }
        return image;
    }
}
