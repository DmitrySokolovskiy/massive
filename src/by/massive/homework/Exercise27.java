package by.massive.homework;

import by.massive.universal.Util;

import java.util.Random;
import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Vvedite Razmernost'");
        while (!sc.hasNextInt()) {
            System.out.println("Vvedite Razmernost'");
            sc.nextLine();
        }
        int razmer = sc.nextInt();

        System.out.println("Vvedite perviy stolbec");
        sc.nextLine();
        while (!sc.hasNextInt()) {
            System.out.println("Vvedite perviy stolbec");
            sc.nextLine();
        }
        int n = sc.nextInt();

        System.out.println("Vvedite vtoroy stolbec");
        sc.nextLine();
        while (!sc.hasNextInt()) {
            System.out.println("Vvedite vtoroy stolbec");
            sc.nextLine();
        }
        int m = sc.nextInt();


        int[][] mass = new int[razmer][razmer];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(9);
            }
        }

        Util.arrayPrinter(mass, 4);
        System.out.println();

        if (n > razmer | m > razmer){
            return;
        }
        for (int i = 0; i < mass.length; i++) {
            int temp = mass[i][n];
            mass[i][n] = mass[i][m];
            mass[i][m] = temp;
        }

        Util.arrayPrinter(mass, 4);
    }
}
