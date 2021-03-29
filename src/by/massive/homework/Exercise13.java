package by.massive.homework;

import by.massive.universal.Util;

public class Exercise13 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i % 2 != 0) {
                    mass[i][j] = n - j;
                } else {
                    mass[i][j] = j + 1;
                }
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
