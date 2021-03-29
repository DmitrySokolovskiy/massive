package by.massive.homework;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        int n = 5;
        int[][] mass = new int[n][n];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(9);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.printf("%2d", mass[i][0]);
            System.out.printf("%2d", mass[i][mass.length-1]);
            System.out.println();
        }
    }
}
