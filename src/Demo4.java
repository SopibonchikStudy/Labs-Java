import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt() + 5;
        if(n % 2 == 0) System.out.println("even");
        else System.out.println("odd");
    }
}