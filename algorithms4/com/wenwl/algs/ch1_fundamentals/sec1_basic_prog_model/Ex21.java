package com.wenwl.algs.ch1_fundamentals.sec1_basic_prog_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author wenwl
 * @className Ex21
 * @data 2020/4/18 18:17
 * @vserion 1.0.0
 */
public class Ex21 {

    public static void main(String[] args) {
        StdOut.println("Please enter the number of records:");
        int rows = StdIn.readInt();
        String[][] table = new String[rows][4];
        StdIn.readLine();
        StdOut.println("Please enter the data:");
        for (int i = 0;i < table.length; i++) {
            String line = StdIn.readLine();
            if(line != null ){
                String[] lineDataArr = line.split(" ");
                for (int j = 0; j < lineDataArr.length; j++) {
                    table[i][j] = lineDataArr[j];
                }
                double value = Double.parseDouble(lineDataArr[1]) / Double.parseDouble(lineDataArr[2]);
                table[i][3] = String.valueOf(value);
            }
        }

        for (int i = 0; i < table.length; i++) {
            StdOut.printf("%s %s %s %3s\n",table[i][0],table[i][1],table[i][2],table[i][3]);
        }
    }

}
