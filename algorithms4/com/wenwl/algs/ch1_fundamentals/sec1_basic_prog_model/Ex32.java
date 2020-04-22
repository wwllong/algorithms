package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdStats;

/**
 * @author wenwl
 * @className Ex32
 * @data 2020/4/22 22:31
 * @vserion 1.0.0
 */
public class Ex32 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double l = Double.parseDouble(args[1]),
                r = Double.parseDouble(args[2]);

        double[] values = StdIn.readAllDoubles();

        histogram(values, n, l, r);
    }

    /**
     * 柱形图
     * @param values 值
     * @param n 区间分为n段
     * @param l 区间起始
     * @param r 区间结束
     */
    private static void histogram(double[] values, int n, double l, double r) {

        int[] counts = new int[n];
        // 统计
        for (int i = 0; i < values.length; i++)
        {
            int k = getInterval(values[i], n, l, r);
            if (k >= 0) {
                counts[k]++;
            }
        }

        int maxCount = StdStats.max(counts);

        // 初始化画布
        StdDraw.setCanvasSize(1024, 512);
        StdDraw.setXscale(l, r);
        StdDraw.setYscale(0, maxCount);

        // 绘制直方图
        double w = (r - l) / n;
        for (int i = 0; i < n; i++)
        {
            double x = l + (i + 0.5) * w,
                    y = counts[i] / 2.0,
                    rw = 0.5 * w,
                    rh = counts[i] / 2.0;
            StdDraw.filledRectangle(x, y, rw, rh);
        }
    }

    /**
     * 获取 当前值 所在区间
     * @param v 当前值
     * @param n 区间分为n段
     * @param l 区间起始
     * @param r 区间结束
     * @return
     */
    private static int getInterval(double v, int n, double l, double r) {
        if (v < l || v >= r){
            return -1;
        }else{
            return (int)(n * (v - l) / (r - l));
        }
    }

}
