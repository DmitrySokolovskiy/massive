package by.massive.homework;

import by.massive.universal.Util;

public class Exercise25 {
    public static void main(String[] args) {
        int n = 9;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = i * n + j+1;
            }
        }
        Util.arrayPrinter(mass, 10);
    }
}
