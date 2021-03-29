package by.massive.homework;

import by.massive.universal.Util;

public class Exercise14 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = mass[i].length - 1; j >= 0; j--) {
                if (mass.length - 1 - i == j){
                    mass[i][j] = mass[i].length - 1 - j;
                }
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
