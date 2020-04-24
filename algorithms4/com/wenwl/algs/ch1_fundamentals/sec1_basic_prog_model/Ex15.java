package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author wenwl
 * @className Ex15
 * @data 2020/4/18 13:50
 * @vserion 1.0.0
 */
public class Ex15 {

    private static int[] histogram(int[] a, int m) {
        int[] resultArr = new int[m];
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0 && a[i] < m ){
                resultArr[a[i]] ++ ;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {

        int[] arr = {2,2,3,4,5,9,9};
        int[] resultArr = histogram(arr, 10);

        for (int i = 0; i < resultArr.length; i++) {
            StdOut.printf("%3d", resultArr[i]);
        }
    }
}
