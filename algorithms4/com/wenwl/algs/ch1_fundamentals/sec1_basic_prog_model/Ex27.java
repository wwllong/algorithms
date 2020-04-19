package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex27
 * @data 2020/4/19 16:07
 * @vserion 1.0.0
 */
public class Ex27 {

    private static long COUNT = 0;
    private static long BETTER_COUNT = 0;

    public static void main(String[] args) {
        /** 在N很大的时候递归层数很深
         * result：0.058399200439453125 count：2467
         * result：0.009922275279677706 count：2435538
         * result：0.0019305450194630897 count：2440764535
         */
        StdOut.printf("result：%s count：%s\n", binomial(10, 5, 0.25), COUNT);
        COUNT = 0;
        StdOut.printf("result：%s count：%s\n", binomial(20, 10, 0.25), COUNT);
        COUNT = 0;
        StdOut.printf("result：%s count：%s\n", binomial(30, 15, 0.25), COUNT);

        StdOut.printf("result：%s betterCount：%s\n", betterBinomial(10, 5, 0.25), BETTER_COUNT);
        BETTER_COUNT = 0;
        StdOut.printf("result：%s betterCount：%s\n", betterBinomial(20, 10, 0.25), BETTER_COUNT);
        BETTER_COUNT = 0;
        StdOut.printf("result：%s betterCount：%s\n", betterBinomial(30, 15, 0.25), BETTER_COUNT);
    }

    /**
     * 二项分布
     * @param n 实验次数
     * @param k 事件发生次数
     * @param p 事件发生的概率
     * https://blog.csdn.net/q932104843/article/details/51921756
     * @return
     */
    private static double binomial(int n, int k, double p) {
        COUNT++;
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(n - 1, k, p) + p * binomial(n - 1, k - 1, p);
    }

    private static double betterBinomial(int n, int k, double p){
        BETTER_COUNT++;
        double[][] matrix = new double[n+1][k+1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                matrix[i][j] = -1;
            }
        }
        return betterBinomial(n,k,p,matrix);
    }

    private static double betterBinomial(int n, int k, double p, double[][] matrix) {
        BETTER_COUNT++;
        if (n == 0 && k == 0) {
            return 1.0;
        }
        if (n < 0 || k < 0) {
            return 0.0;
        }
        if (matrix[n][k] == -1){
            matrix[n][k] = (1.0 - p) * betterBinomial(n-1, k, p, matrix) + p * betterBinomial(n-1, k-1, p, matrix);
        }
        return matrix[n][k];
    }


}
