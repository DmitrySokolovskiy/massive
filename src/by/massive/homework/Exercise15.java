package by.massive.homework;

import by.massive.universal.Util;

public class Exercise15 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = n - i;
        }
        Util.arrayPrinter(mass, 2);
    }
}
