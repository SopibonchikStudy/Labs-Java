import java.util.Scanner;

public class Demo3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lim = scanner.nextInt();
        int ans = 1;
        int power = 0;
        while (ans <= lim) {
            ans *= 2;
            power += 1;
        }
        System.out.println(ans / 2);
        System.out.println(power-1);
    }
}
