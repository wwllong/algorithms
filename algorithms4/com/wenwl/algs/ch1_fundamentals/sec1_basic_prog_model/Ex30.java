package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex30
 * @data 2020/4/19 21:08
 * @vserion 1.0.0
 */
public class Ex30 {

    private static int euclid(int p, int q) {
        if (p == 0 || q == 0) {
            return 1;
        }
        if (p < q) {
            int temp = p;
            p = q;
            q = temp;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        boolean[][] matrix = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (euclid(i, j) == 1){
                    matrix[i][j] = true;
                }
                StdOut.printf("%s ",matrix[i][j]);
            }
            StdOut.println();
        }
    }

}
