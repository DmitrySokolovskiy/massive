package by.massive.homework;

import by.massive.universal.Util;

public class Exercise19 {
    public static void main(String[] args) {
        int n = 63;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = i; j <= mass[i].length / 2; j++) {
                mass[i][mass[i].length - 1 - j] = 1;
                mass[i][j] = 1;
            }
            for (int j = i; j <= mass[i].length / 2; j++) {
                mass[mass.length - 1 - i][mass[i].length - 1 - j] = 1;
                mass[mass.length - 1 - i][j] = 1;
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
