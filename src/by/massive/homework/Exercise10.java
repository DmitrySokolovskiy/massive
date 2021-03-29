package by.massive.homework;

import by.massive.universal.Util;

import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {
        int n = 9;
        int k = 2;
        int p = 3;
        int[][] mass = new int[n][n];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(30);
            }
        }
        System.out.println(mass[p][k]);

        Util.arrayPrinter(mass, 3);
    }
}
