package by.massive.homework;

import by.massive.universal.Util;

public class Exercise1 {
    public static void main(String[] args) {

        int[][] mass = new int[3][4];

        for (int i = 0; i < mass.length; i++) {
            mass[i][0] = 1;
        }
        Util.arrayPrinter(mass, 2);
    }
}
