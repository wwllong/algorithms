package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.awt.*;

/**
 * @author wenwl
 * @className Ex31
 * @data 2020/4/21 22:24
 * @vserion 1.0.0
 */
public class Ex31 {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double p = Double.parseDouble(args[1]);
        p = Math.max(0,Math.min(1,p));
        drawRandConn(n,p);
    }

    /**
     * 随机连接
     * @param n N个点
     * @param p 每对点灰线连接概率
     */
    public static void drawRandConn(int n,double p){
        // 初始化画布
        StdDraw.setCanvasSize(1024, 1024);
        StdDraw.setScale(-1.0, 1.0);
        StdDraw.circle(0, 0, 0.5);
        StdDraw.setPenRadius(.15);

        double[][] d = new double[n][2];
        double angle = 360.0 / n;
        StdDraw.setPenRadius(.025);
        for (int i = 0; i < n; i++) {
            d[i][0] = 0.5 * Math.cos(angle * i * Math.PI / 180);
            d[i][1] = 0.5 * Math.sin(angle * i * Math.PI / 180);
            StdDraw.point(d[i][0], d[i][1]);
        }
        StdDraw.setPenColor(Color.GRAY);
        StdDraw.setPenRadius();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if(StdRandom.bernoulli(p)){
                    StdDraw.line(d[i][0],d[i][1],d[j][0],d[j][1]);
                }
            }
        }

    }
}
