package by.massive.homework;

import by.massive.universal.Util;

import java.util.Random;

public class Exercise11{
    public static void main(String[] args) {
        int n = 7;
        int m = 9;
        int[][] mass = new int[n][m];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(9);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (i % 2 == 0) {
                    System.out.printf("%2d", mass[i][mass[i].length-1-j]);
                } else {
                    System.out.printf("%2d", mass[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println();
        Util.arrayPrinter(mass, 2);
    }
}
