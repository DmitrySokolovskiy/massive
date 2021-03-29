package by.massive.homework;

import by.massive.universal.Util;

public class Exercise24 {
    public static void main(String[] args) {
        int n = 9;
        int[] inpArray = {2,2,3,4};
        int[][] mass = new int[n][inpArray.length];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < inpArray.length; j++) {
                mass[i][j] = (int)Math.pow(inpArray[j], i);
            }
        }
        Util.arrayPrinter(mass, 10);
    }
}
