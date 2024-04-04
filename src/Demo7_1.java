import java.util.Scanner;

public class Demo7_1 {
    public static void main(String[] args) {
        // берет размер матрицы, вводит её в строку. переворачивает по горизонтали и вертикали
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split(" ");
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                matrix[n - i - 1][m - j - 1] = Integer.parseInt(arr[i * m + j]);
            }
        }
        printArr(matrix);
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
