package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

/**
 * @author wenwl
 * @className BruteForceSearch
 * @dsecription 暴力查找
 * @data 2020/4/26 23:02
 * @vserion 1.0.0
 */
public class BruteForceSearch {

    public static int indexOf(int key, int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

}
