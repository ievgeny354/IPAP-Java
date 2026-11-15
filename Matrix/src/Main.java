import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//задаем размеры матрицы
        int[][] matr = createMatrixOfZeros();
        printMatr(matr);
        randomize(matr);
        printMatr(matr);
        printLineSums(matr);
        maxMatrix(matr);
        maxNumber(matr);
        System.out.println("Максимальное значение в массиве=" + maxNumber(matr));
        minNumber(matr);
        System.out.println("Минимальное значение в массиве=" + minNumber(matr));
        woMaxMin(matr);
    }

    private static int[][] createMatrixOfZeros() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размеры матрицы (строки, столбцы):");
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matr = new int[n][m];
        return matr;
    }

    private static void randomize(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {

                Random rn = new Random();
                int randomNum = rn.nextInt(100); //от 0 до 99
                matr[i][j] = randomNum;
            }
        }
    }

    public static void printMatr(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                System.out.printf(" %3d", matr[i][j]);
            }
            System.out.println();
        }
    }

    public static void printLineSums(int[][] matr) {
        for (int i = 0; i < matr.length; i++) {
            int s = 0;
            for (int j = 0; j < matr[i].length; j++) {
                s += matr[i][j];
            }
            System.out.println("сумма элементов строки " + i + " равна " + s);
        }
    }

    public static int maxNumber(int[][] matr) {
        int max = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] > max) {
                    max = matr[i][j];
                }
            }
        }
        return max;
    }

    public static int maxMatrix(int[][] matr) {
        int max = maxNumber(matr);
        int line = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] == max) {
                    System.out.println("максимальный элемент массива находится в (строке:" + (i + 1) + ", столбце:" + (j + 1) + ")");
                    line = i;
                }
            }
        }
        return line;
    }

    public static int minNumber(int[][] matr) {
        int min = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if (matr[i][j] < min) {
                    min = matr[i][j];
                }
            }
        }
        return min;
    }

    public static void woMaxMin(int[][] matr) {
        int max = maxNumber(matr);
        int min = minNumber(matr);
        int line = 0;
        for (int i = 0; i < matr.length; i++) {
            for (int j = 0; j < matr[i].length; j++) {
                if ((matr[i][j] != max) || (matr[i][j] != min)) {
                    System.out.println("нет максимального или минимального значения массива [" + i+"],["+j+"]");
               /* } else {
                    System.out.println("нет максимального или минимального значения массива " + i);*/
                }
            }
        }
    }
}





