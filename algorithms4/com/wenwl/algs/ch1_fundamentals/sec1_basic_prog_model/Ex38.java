package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author wenwl
 * @className Ex38
 * @data 2020/4/26 22:43
 * @vserion 1.0.0
 */
public class Ex38 {

    public static void main(String[] args) {
        // 从文件中读取整数
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();

        long startTime = System.currentTimeMillis();
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(BruteForceSearch.indexOf(key, whiteList) == -1){
                StdOut.println(key);
            }
        }
        long endTime = System.currentTimeMillis();
        StdOut.println("BinarySearch time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        // 数组排序
        Arrays.sort(whiteList);
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(BinarySearch.indexOf(whiteList, key) == -1){
                StdOut.println(key);
            }
        }
        endTime = System.currentTimeMillis();
        StdOut.println("BruteForceSearch time: " + (endTime - startTime));
    }

}
