package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex09
 * @data 2020/4/17 0:31
 * @vserion 1.0.0
 */
public class Ex09 {

    public static void main(String[] args) {

        int N = 10;

        StdOut.println(Integer.toBinaryString(N));

        String s = "";
        for(int n = N; n > 0; n /= 2){
            s = (n % 2) + s;
        }
        StdOut.println(s);

    }

}
