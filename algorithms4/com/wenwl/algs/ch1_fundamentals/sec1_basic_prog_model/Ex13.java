package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex13
 * @data 2020/4/17 1:00
 * @vserion 1.0.0
 */
public class Ex13 {

    public static void main(String[] args) {

        int[][] arr = {
                {0,1,0},
                {1,0,1}
        };

        printTransposeMatrix(arr);
    }

    /**
     * 打印数组的转置
     * @param arr 二维整型数组
     */
    private static void printTransposeMatrix(int[][] arr) {

        for (int i = 0; i < arr[0].length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                StdOut.printf("%2d",arr[j][i]);
            }
            StdOut.println();
        }
        
    }


}
