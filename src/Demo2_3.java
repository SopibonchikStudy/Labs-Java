import java.util.Scanner;

public class Demo2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() + 6;
        if(n % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}