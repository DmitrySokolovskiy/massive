package by.massive.homework;

public class Exercise1 {
    public static void main(String[] args) {

        int[][] mass = new int[3][4];

        for (int i = 0; i < mass.length; i++) {
            mass[i][0] = 1;
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.printf("%2d", mass[i][j]);
            }
            System.out.println();
        }
    }
}
