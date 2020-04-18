package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex14
 * @data 2020/4/17 23:32
 * @vserion 1.0.0
 */
public class Ex14 {

    public static void main(String[] args) {
        StdOut.println(lg(1025));
        StdOut.println(lg2(1025));
    }

    /**
     * 返回不大于logN的最大整数
     * @param n
     * @return
     */
    private static int lg(int n) {
        int i = 0 ,j = 1;
        while ( (j <<= 1 ) <= n){
            ++i;
        }
        return i;
    }

    private static int lg2(int n) {
        int i = 0;
        do {
            n >>= 1;
            ++i;
        } while (n != 0);
        return i - 1;
    }


}
