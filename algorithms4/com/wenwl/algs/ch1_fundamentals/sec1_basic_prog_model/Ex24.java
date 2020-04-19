package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex23
 * @data 2020/4/19 9:27
 * @vserion 1.0.0
 */
public class Ex24 {

    public static void main(String[] args) {
        StdOut.printf("result：%s\n",euclid(1111111, 1234567));
        StdOut.printf("result：%s\n",euclid(1997, 615));
    }

    private static int euclid(int p, int q) {
        StdOut.printf("p=%s,q=%s\n", p, q);
        if (p == 0 || q == 0) {
            return 1;
        }
        if (p < q) {
            int temp = p;
            p = q;
            q = temp;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }

}
