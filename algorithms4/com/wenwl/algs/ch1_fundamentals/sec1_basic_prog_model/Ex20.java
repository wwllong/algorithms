package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex20
 * @data 2020/4/18 17:49
 * @vserion 1.0.0
 */
public class Ex20 {

    public static void main(String[] args) {
        StdOut.println(ln(10));
    }

    /**
     * ln(N!)
     * 阶乘的递归定义 0!=1，n!=(n-1)!×n。
     * @param n
     * @return
     */
    private static double ln(int n) {
        if(n == 0 || n == 1){
            return 0.0;
        }else {
            return Math.log(n) + ln(n-1);
        }
    }


}
