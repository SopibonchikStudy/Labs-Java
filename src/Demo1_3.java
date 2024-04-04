import java.util.Scanner;
public class Demo1_3 {
    public static void main(String[] args) {
        int N = 5;
        double cost = 123.45*N, discount = 0.95;
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = cost*n;
        result *= discount;
        System.out.printf("%.2f",result);
        scanner.close();
    }
}
