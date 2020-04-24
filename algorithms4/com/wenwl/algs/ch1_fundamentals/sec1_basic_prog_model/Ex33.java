package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * @author wenwl
 * @className Ex33
 * @data 2020/4/23 22:54
 * @vserion 1.0.0
 */
public class Ex33 {

    public static void testDot(){
        double[] x = {5.0, 1.0};
        double[] y = {1.0, 5.0};
        double dot = Matrix.dot(x, y);
        StdOut.println(dot);
    }

    public static void testMultAB(){
        double[][] a = {
                {3.0, 0.0},
                {-2.0, 0.0},
                {5.0, 1.0}
        };
        double[][] b = {
                {2.0, 0.0, 1.0},
                {-3.0, 4.0, 1.0}
        };
        double[][] mult = Matrix.mult(a, b);
        for ( double[] arr : mult) {
            for(double item : arr){
                StdOut.printf("%s ",item);
            }
            StdOut.println();
        }
    }

    public static void testTranspose(){
        double[][] a = {
                {1.0, 2.0},
                {3.0, 4.0},
                {5.0, 1.0}
        };
        double[][] mult = Matrix.transpose(a);
        for ( double[] arr : mult) {
            for(double item : arr){
                StdOut.printf("%s ",item);
            }
            StdOut.println();
        }
    }

    public static void testMultAX(){
        double[][] a = {
                {1.0, 2.0},
                {3.0, 4.0}
        };
        double[] x = {1.0, 2.0};
        double[] mult = Matrix.mult(a, x);
        StdOut.println(Arrays.toString(mult));
    }

    public static void testMultYA(){
        double[][] a = {
                {1.0, 2.0},
                {3.0, 4.0}
        };
        double[] y = {1.0, 2.0};
        double[] mult = Matrix.mult(y, a);
        StdOut.println(Arrays.toString(mult));
    }

    public static void main(String[] args) {
        testDot();
        StdOut.println();
        testMultAB();
        StdOut.println();
        testTranspose();
        StdOut.println();
        testMultAX();
        StdOut.println();
        testMultYA();
    }

}
