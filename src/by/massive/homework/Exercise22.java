package by.massive.homework;

import by.massive.universal.Util;

public class Exercise22 {
    public static void main(String[] args) {
        int n = 9;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length - i; j++) {
                mass[i][mass[i].length - 1 - i - j] = n - j;
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
