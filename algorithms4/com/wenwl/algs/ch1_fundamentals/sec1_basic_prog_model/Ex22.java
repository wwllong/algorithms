package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author wenwl
 * @className Ex22
 * @data 2020/4/18 23:46
 * @vserion 1.0.0
 */
public class Ex22 {

    public static void main(String[] args) {
        // 从文件中读取整数
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();
        // 数组排序
        Arrays.sort(whiteList);
        // 读取键值，如果不存在于白名单中将其打印
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            if (indexOf(whiteList, key) == -1) {
                StdOut.println(key);
            }
        }
    }

    private static int indexOf(int[] a, int key) {
        return indexOf(a, key, 0, a.length - 1, 0);
    }

    private static int indexOf(int[] a, int key, int lo, int hi, int depth) {

        StdOut.printf("%s lo=%s hi=%s\n",repeat(depth, ' '), lo, hi);

        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return indexOf(a, key, lo, mid - 1, depth + 1);
        } else if (key > a[mid]) {
            return indexOf(a, key, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }

    }

    private static String repeat(int n, char c){
        String s = "";
        for (int i = 0; i < n; i++) {
           s += c;
        }
        return s;
    }


}
