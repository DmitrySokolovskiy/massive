package by.massive.homework;

import by.massive.universal.Util;

public class Exercise12 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length - 1; i++) {
            mass[mass.length - 1 - i][mass.length - 1 - i] = n - 1 - i;
        }
        Util.arrayPrinter(mass, 2);
    }
}
