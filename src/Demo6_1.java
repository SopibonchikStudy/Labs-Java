import java.util.Scanner;

public class Demo6_1 {
    public static void main(String[] args) {
        // Печать массива в обратном порядке через пробел
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[arr.length - i - 1]);
            if (i != n - 1) System.out.print(" ");
        }
    }
}
