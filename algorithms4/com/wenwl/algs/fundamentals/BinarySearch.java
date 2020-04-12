package com.wenwl.algs.fundamentals;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author wenwl
 * @className BinarySearch
 * @dsecription 二分查找
 * @data 2020/4/12 18:00
 * @vserion 1.0.0
 */
public class BinarySearch {


    public static int rank(int key, int[] a) {
        // 数组必须是有序的
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
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whileList = In.readInts(args[0]);
        Arrays.sort(whileList);
        while(!StdIn.isEmpty()){
            // 读取键值，如果不存在于白名单中将其打印
            int key = StdIn.readInt();
            if(rank(key, whileList) < 0){
                StdOut.println(key);
            }
        }
    }


}
