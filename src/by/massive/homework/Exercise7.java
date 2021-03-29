package by.massive.homework;

import by.massive.universal.Util;

import java.util.Random;

public class Exercise7 {
    public static void main(String[] args) {
        int n = 5;
        int[][] mass = new int[n][n];
        Random rnd = new Random();
        int result = 0;

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(30) - 23;
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                result += mass[i][j] < 0 ? Math.abs(mass[i][j]) : 0;
            }
        }

        System.out.println(result);
        Util.arrayPrinter(mass, 4);
    }
}
