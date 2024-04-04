import java.util.Scanner;

public class Practice7_1 {
    public static void main(String[] args) {
        // Вывести массив змейкой( заполнить от 1 до n*m
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int counter = 1;
        int[][] arr = new int[n][m];
        int i = n - 1;
        while (i >= 0) {
            if (i % 2 == (n - 1) % 2) {
                int j = m - 1;
                while (j >= 0) {
                    arr[i][j] = counter;
                    --j;
                    ++counter;
                }
            } else {
                int j = 0;
                while (j < m) {
                    arr[i][j] = counter;
                    ++j;
                    ++counter;
                }
            }
            --i;
        }
        printArr(arr);
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                System.out.print(arr[i][j]);
                if (j != arr[0].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
