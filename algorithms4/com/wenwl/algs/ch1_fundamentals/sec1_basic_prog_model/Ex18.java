package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex18
 * @data 2020/4/18 15:53
 * @vserion 1.0.0
 */
public class Ex18 {

    /**
     * 返回 a * b
     */
    private static int mystery(int a, int b) {
        if(b == 0){
            return 0;
        }
        if(b % 2 == 0){
            return mystery(a + a, b / 2);
        }else{
            return mystery(a + a, b / 2) + a;
        }
    }

    /**
     * 返回 a^b
     */
    private static int mystery2(int a, int b) {
        if(b == 0){
            return 1;
        }
        if(b % 2 == 0){
            return mystery2(a * a, b / 2);
        }else{
            return mystery2(a * a, b / 2) * a;
        }
    }

    public static void main(String[] args) {
        StdOut.println(mystery(2,25));
        StdOut.println(mystery(3,11));
        StdOut.println(mystery2(2,25));
        StdOut.println(mystery2(3,11));
    }

}
