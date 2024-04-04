import java.util.Scanner;

public class Practice1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        int N = 5;
        double res = Math.abs((a - N) / (2 * b)) + (Math.log(N / b)) / (Math.log(a));
        System.out.printf("%.2f", res);
    }
}
// N = 5
// Вариант 6