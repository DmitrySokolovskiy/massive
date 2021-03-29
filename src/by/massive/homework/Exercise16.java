package by.massive.homework;

import by.massive.universal.Util;

public class Exercise16 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];

        for (int i = 0; i < mass.length; i++) {
            mass[i][i] = (n - (mass.length -1 -i))  * (i+2);
        }
        Util.arrayPrinter(mass, 3);
    }
}
