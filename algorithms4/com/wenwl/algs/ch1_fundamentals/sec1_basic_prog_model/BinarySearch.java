package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

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
 * @src_code https://algs4.cs.princeton.edu/code/edu/princeton/cs/algs4/BinarySearch.java.html
 */
public class BinarySearch {

    /**
     * 不应实例化此类
     */
    private BinarySearch() { }

    /**
     * 返回指定键在指定数组中的索引。
     * @param a 一个整形数组，并且必须按照升序排序
     * @param key 搜寻的键
     * @return 数组中键的索引（如果存在）；否则返回-1
     */
    public static int indexOf(int[] a, int key){
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
        // 从文件中读取整数
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();
        // 数组排序
        Arrays.sort(whiteList);
        // 读取键值，如果不存在于白名单中将其打印
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(indexOf(whiteList, key) == -1){
                StdOut.println(key);
            }
        }
    }


}
