package by.massive.homework;

import by.massive.universal.Util;

public class Exercise20 {
    public static void main(String[] args) {
        int n = 9;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = i; j <= mass[i].length / 2; j++) {
                mass[j][mass[j].length - 1 - i] = 1;
                mass[j][i] = 1;
            }
            for (int j = i; j <= mass[i].length / 2; j++) {
                mass[mass.length - 1 - j][mass[i].length - 1 - i] = 1;
                mass[mass.length - 1 - j][i] = 1;
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
