import java.util.Scanner;

public class Practice3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minOdd = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            int temp = scanner.nextInt();
            if (temp % 2 == 1) {
                minOdd = Math.min(minOdd, temp);
            }
        }
        if (minOdd == Integer.MAX_VALUE) {
            System.out.println("undefined");
        }else{
            System.out.println(minOdd);
        }
    }
}
