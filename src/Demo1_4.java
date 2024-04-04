import java.util.Scanner;

public class Demo1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = 5;
        char symbol = scanner.next().charAt(0);
        System.out.println(symbol += N);
    }
}
