package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex19
 * @data 2020/4/18 16:20
 * @vserion 1.0.0
 */
public class Ex19 {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
//            StdOut.printf("%d %d\n",i,f(i));
            StdOut.printf("%d %d\n",i,fib(i));
        }
    }

    /**
     * 40 102334155
     * 45 1134903170
     * 50 12586269025
     * @param n
     * @return
     */
    public static long f(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return f(n-1) + f(n-2);
    }

    public static long fib(int n){
        // 创建并初始化数组，保存计算过的值
        long[] arr = new long[n+1];
        return fib(n, arr);
    }

    public static long fib(int n, long[] arr)
    {
        if (arr[n] == 0){
            if (n == 1){
                arr[n] = 1;
            }else if (n > 1){
                arr[n] = fib(n-1, arr) + fib(n-2, arr);
            }
        }

        return arr[n];
    }

    /**
     * 非递归
     */
    public static long[] fib2(int n) {
        long[] arr = new long[n + 1];
        if (n == 0) {
            return arr;
        }
        if (n == 1) {
            return arr;
        }
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }


}
