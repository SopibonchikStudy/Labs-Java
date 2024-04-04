import java.util.Scanner;

public class Practice5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        int n = 5;
        a = scanner.nextInt() * n;
        b = scanner.nextInt() * n;
        c = scanner.nextInt() * n;
        d = scanner.nextInt() * n;
        System.out.printf("%.2f", countPerimeter(a, b, c, d));
    }

    static double countPerimeter(int a, int b, int c, int d) {
        return Math.sqrt(Math.pow(c - a,2) + Math.pow(d - b,2))*4;
    }
}
