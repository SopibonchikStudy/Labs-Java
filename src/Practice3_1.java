import java.util.Scanner;

public class Practice3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 100;
        int num = scanner.nextInt();
        while (!((num >= -15 * n && num <= -11 * n) || (num >= 11 * n && num <= 15 * n))) {
            System.out.println("Not yet");
            num = scanner.nextInt();
        }
        System.out.println("Correct_number_" + num);
    }
}
