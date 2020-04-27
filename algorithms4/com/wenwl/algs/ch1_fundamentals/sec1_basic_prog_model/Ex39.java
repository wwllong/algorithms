package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * @author wenwl
 * @className Ex39
 * @dsecription 随机匹配
 * @data 2020/4/27 23:23
 * @vserion 1.0.0
 */
public class Ex39 {

    private static void batch(int t, int n) {
        long count = 0;
        for (int i = 0; i < t; i++) {
            count += experiment(n);
        }

        double avg = 1.0 * count / t;

        StdOut.printf("%8d: %9.2f\n", n, avg);
    }

    private static long experiment(int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(100000, 1000000);
            b[i] = StdRandom.uniform(100000, 1000000);
        }

        Arrays.sort(b);

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(BinarySearch.indexOf(b, a[i]) >=0 ){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int t = Integer.parseInt(args[0]);

        int[] n = {1000, 10000, 100000, 1000000};

        for (int i = 0; i < n.length; i++) {
            batch(t, n[i]);
        }

    }

}
