package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex16
 * @data 2020/4/18 15:33
 * @vserion 1.0.0
 */
public class Ex16 {

    private static String exR1(int n) {
        if(n <= 0){
            return "";
        }else{
            return exR1(n-3) + n + exR1(n-2) + n;
        }
    }

    public static void main(String[] args) {
        StdOut.println(exR1(6));
    }

}
