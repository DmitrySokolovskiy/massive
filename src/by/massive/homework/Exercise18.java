package by.massive.homework;

import by.massive.universal.Util;

public class Exercise18 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = i; j < mass[i].length; j++){
                mass[i][mass[i].length -1 - j] = i + 1;
            }
        }
        Util.arrayPrinter(mass, 2);
    }
}
