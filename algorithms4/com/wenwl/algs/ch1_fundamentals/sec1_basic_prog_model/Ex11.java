package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex11
 * @data 2020/4/17 0:36
 * @vserion 1.0.0
 */
public class Ex11 {

    /**
     * 打印二维数组内容（*为真，‘’为假）以及行列号
     * @param arr 布尔类型二维数组
     */
    private static void printBooleanMatrix(boolean[][] arr) {

        StdOut.print(" ");
        for (int i = 0; i < arr[0].length; i++) {
            StdOut.printf("%2s",i);
        }
        StdOut.println();
        for (int i = 0; i < arr.length; i++) {
            StdOut.print(i);
            for (int j = 0; j < arr[i].length; j++) {
                StdOut.printf("%2s", arr[i][j] ? '*' : ' ');
            }
            StdOut.println();
        }

    }

    public static void main(String[] args) {

        boolean[][] arr = {
                {true,false,true,false},
                {false,true,false,true},
                {true,false,true,false},
                {false,true,false,true},
        };

        printBooleanMatrix(arr);

    }
}
