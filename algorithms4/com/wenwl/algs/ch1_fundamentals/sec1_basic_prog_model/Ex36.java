package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author wenwl
 * @className Ex36
 * @dsecription 乱序检查
 * @data 2020/4/25 17:01
 * @vserion 1.0.0
 */
public class Ex36 {

    /**
     * 乱序检查。 数组中所有元素的值接近于N/M
     * @param m 数组大小
     * @param n 打乱n次
     */
    public static void shuffleTest(int m, int n){

        int[][] t = new int[m][m];

        for (int i = 0; i < n; i++) {

            int[] a = new int[m];
            for (int j = 0; j < m; j++) {
                a[j] = j;
            }

            // 随机排序
            StdRandom.shuffle(a);

            for (int j = 0; j < m; j++) {
                t[j][a[j]]++;
            }
                
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                StdOut.printf("%7d", t[i][j]);
            }
            StdOut.println();
        }

    }

    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        shuffleTest(m, n);
    }
}
