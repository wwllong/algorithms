package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * @author wenwl
 * @className Ex35
 * @dsecription 模拟骰子
 * @data 2020/4/24 23:07
 * @vserion 1.0.0
 */
public class Ex35 {

    private static final int SIDES = 6;

    /**
     * 两个骰子之和的准确概率分布
     *
     * @return
     */
    public static double[] getExact() {

        double[] dist = new double[2 * SIDES + 1];

        for (int i = 1; i <= SIDES; i++) {
            for (int j = 1; j <= SIDES; j++) {
                dist[i + j] += 1.0;
            }
        }

        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= SIDES * SIDES;
        }

        return dist;
    }

    /**
     * 实验性 N 次 掷骰子
     *
     * @return
     */
    public static double[] getExperim(int n) {

        double[] dist = new double[2 * SIDES + 1];

        for (int i = 1; i < n; i++) {
            dist[throwDice()]++;
        }

        for (int k = 2; k <= 2 * SIDES; k++) {
            dist[k] /= n;
        }

        return dist;
    }

    /**
     * 掷骰子
     *
     * @return 两个骰子之和
     */
    private static int throwDice() {
        return StdRandom.uniform(1, SIDES + 1) + StdRandom.uniform(1, SIDES + 1);
    }

    public static void main(String[] args) {
        // n >= 10,000,000 , 实验数据 和 准确数据 吻合程度达到小数后三位
        int n = Integer.parseInt(args[0]);

        double[] exact = getExact();
        for (int i = 2; i <= 2 * SIDES; i++) {
            StdOut.printf("%7d", i);
        }
        StdOut.println();
        for (int i = 2; i <= 2 * SIDES; i++) {
            StdOut.printf("%7.3f", exact[i]);
        }
        StdOut.println();

        double[] experim = getExperim(n);

        for (int i = 2; i <= 2 * SIDES; i++) {
            StdOut.printf("%7.3f", experim[i]);
        }
        StdOut.println();
    }

}
