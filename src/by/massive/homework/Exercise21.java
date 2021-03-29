package by.massive.homework;

import by.massive.universal.Util;

public class Exercise21 {
    public static void main(String[] args) {
        int n = 9;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j <= i; j++) {
                mass[i][i - j] = n - j;
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
