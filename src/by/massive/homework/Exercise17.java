package by.massive.homework;

import by.massive.universal.Util;

public class Exercise17 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            if (i == 0 | i == mass.length - 1) {
                for (int j = 0; j < mass[i].length; j++) {
                    mass[i][j] = 1;
                }
            } else {
                mass[i][0] = 1;
                mass[i][mass.length-1] = 1;
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
