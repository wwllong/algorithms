package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Matrix
 * @dsecription 矩阵库
 * @data 2020/4/23 23:02
 * @vserion 1.0.0
 */
public class Matrix {

    /**
     * 向量点乘（向量的内积、数量积）
     * @param x
     * @param y
     */
    public static double dot(double[] x, double[] y) {
        double result = 0;
        if (x.length == y.length) {
            for (int i = 0; i < y.length; i++) {
                result += x[i] * y[i];
            }
        } else {
            StdOut.print("Error!");
        }
        return result;
    }

    /**
     * 矩阵和矩阵之积
     * @param a
     * @param b
     * @return
     */
    public static double[][] mult(double[][] a, double[][] b){
        if (a[0].length == b.length) {
            double[][] result = new double[a.length][b[0].length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < result[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        result[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            return result;
        } else {
            StdOut.print("Error!");
            return null;
        }
    }

    /**
     * 矩阵转置
     * @param a
     * @return
     */
    public static double[][] transpose(double[][] a){
        double[][] result = new double[a[0].length][a.length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = a[j][i];
            }
        }
        return result;
    }

    /**
     * 矩阵和向量之积
     * @param a
     * @param x
     * @return
     */
    public static double[] mult(double[][] a, double[] x){
        if (a[0].length == x.length) {
            double[] result = new double[a.length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < x.length; j++) {
                    result[i] += a[i][j] * x[j];
                }
            }
            return result;
        }else{
            StdOut.print("Error!");
            return null;
        }
    }

    /**
     * 向量和矩阵之积
     * @param y
     * @param a
     * @return
     */
    public static double[] mult(double[] y, double[][] a){
        if (y.length == a.length) {
            double[] result = new double[a[0].length];
            for (int i = 0; i < result.length; i++) {
                for (int j = 0; j < y.length; j++) {
                    result[i] += y[j] * a[j][i];
                }
            }
            return result;
        }else{
            StdOut.print("Error!");
            return null;
        }
    }
}
