import java.util.Scanner;

public class Demo3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int n = 5;
        while (num >= 0 && num != n) {
            sum += num;
            num = scanner.nextInt();
        }
        System.out.println(sum);
    }
}

/* 3 лабораторная - 7
4 лабораторная - 5

Коля
8
7
 */
