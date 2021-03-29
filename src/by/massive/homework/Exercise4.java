package by.massive.homework;

import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        int n = 7;
        int[][] mass = new int[n][n];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(9);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("%2d", mass[0][i]);
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("%2d", mass[mass.length-1][i]);
        }
    }
}
