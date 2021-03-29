package by.massive.homework;

        import by.massive.universal.Util;

        import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        int[][] mass = new int[2][3];
        Random rnd = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = rnd.nextInt(9);
            }
        }

        Util.arrayPrinter(mass, 2);
    }
}
