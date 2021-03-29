package by.massive.homework;

import by.massive.universal.Util;

public class Exercise23 {
    public static void main(String[] args) {
        int n = 9;
        double[][] mass = new double[n][n];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/ n);
            }
        }
        Util.arrayPrinterDouble(mass);
    }
}
