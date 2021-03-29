package by.massive.homework;

import by.massive.universal.Util;

import java.util.Random;

public class Exercise26 {
    public static void main(String[] args) {
        int n = 4;
        int m = 3;
        int[] indMaxEl = new int[3]; // Храним {значение, индекс строки, индекс столбца}
        int[] indMinEl = new int[3]; // Храним {значение, индекс строки, индекс столбца}

        int[][] mass = new int[n][m];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(18) - 10;
            }
        }

        for (int i = 0; i < mass.length; i++) {
            int minusSum = 0;
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] < 0) {
                    minusSum += mass[i][j];
                }
            }
            System.out.println("Сумма отриц-х значений в строке " + i + "равна: " + minusSum);
        }
        for (int i = 0; i < mass.length; i++) {
            int maxElement = 0;
            for (int j = 0; j < mass[i].length; j++) {
                if (maxElement < mass[i][j]) {
                    maxElement = mass[i][j];
                }
            }
            System.out.println("Максимальный элемент в строке " + i + "равен: " + maxElement);
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(indMaxEl[0] < mass[i][j]) {
                    indMaxEl[0] = mass[i][j];
                    indMaxEl[1] = i;
                    indMaxEl[2] = j;
                }else if (indMinEl[0] > mass[i][j]){
                    indMinEl[0] = mass[i][j];
                    indMinEl[1] = i;
                    indMinEl[2] = j;
                }
            }
        }
        Util.arrayPrinter(mass, 4);

        System.out.println("MaxEl: " + indMaxEl[0]);
        mass[indMaxEl[1]][indMaxEl[2]] = indMinEl[0];

        System.out.println("MinEl: " + indMinEl[0]);
        mass[indMinEl[1]][indMinEl[2]] = indMaxEl[0];


        Util.arrayPrinter(mass, 4);
    }
}
