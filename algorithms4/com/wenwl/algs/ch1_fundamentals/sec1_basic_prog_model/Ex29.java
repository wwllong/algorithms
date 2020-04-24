package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author wenwl
 * @className Ex29
 * @data 2020/4/19 19:36
 * @vserion 1.0.0
 */
public class Ex29 {

    private static int indexOf(int[] a, int key){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // 被查找的键要么不存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                while(--mid >=0 && a[mid] == key);
                return ++mid;
            }
        }
        return -1;
    }

    private static int count(int[] a, int key)
    {
        int count = 0;
        for (int i = indexOf(a, key); i < a.length && a[i] == key; i++){
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // 从文件中读取整数
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();
        // 数组排序
        Arrays.sort(whiteList);
        for (int i = 0; i < whiteList.length; i++) {
            StdOut.printf("%s \n", whiteList[i]);;
        }

        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(indexOf(whiteList, key) != -1){
                StdOut.printf("key：%s less：%s count：%s \n",key,indexOf(whiteList, key), count(whiteList, key));
            }
        }
    }
}
