package by.massive.homework;

import by.massive.universal.Util;

import java.util.Random;

public class Exercise8 {
    public static void main(String[] args) {
        int n = 7;
        int m = 9;
        int count = 0;
        int[][] mass = new int[n][m];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(9);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] == 7) {
                    count++;
                }
            }
        }
        System.out.println(count);
        Util.arrayPrinter(mass, 2);
    }
}
