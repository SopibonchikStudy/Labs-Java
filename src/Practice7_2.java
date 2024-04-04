import java.util.Scanner;

public class Practice7_2 {
    public static void main(String[] args) {
        // вычислить разницу между 1 в строке числом и суммой всех остальных
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] temp = scanner.nextLine().split(" ");
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(temp[i * n + j]);
            }
        }
        for (int i = 0; i < n; ++i) {
            int res = arr[i][0];
            for (int j = 1; j < n; ++j) {
                res -= arr[i][j];
            }
            System.out.println(res);
        }
    }
}
