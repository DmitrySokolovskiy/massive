package by.massive.universal;

public class Util {
    public static void arrayPrinter(int[][] mass, int spaces) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("%" + spaces + "d", mass[i][j]);
            }
            System.out.println();
        }
    }
    public static void arrayPrinterDouble(double[][] mass) {
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.printf("%.1f ", mass[i][j]);
            }
            System.out.println();
        }
    }
}
