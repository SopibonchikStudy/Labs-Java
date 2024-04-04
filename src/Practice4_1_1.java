import java.util.Scanner;

public class Practice4_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = 5;
        int primeSum = 0;
        int nonPrimeSum = 0;
        int nonPrimeCount = 0;
        while (!(input.equalsIgnoreCase("stop"))) {
            int number = Integer.parseInt(input);
            boolean flag = true;
            for (int i = 2; i <= (int) Math.sqrt(number); ++i) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (number < 2 || number == n) {
                System.out.println("invalid");
            } else if (flag) {
                primeSum += number;
            } else {
                nonPrimeSum += number;
                ++nonPrimeCount;
            }
            input = scanner.nextLine();
        }
        System.out.println("prime_" + (primeSum > 0 ? primeSum : "undefined"));
        System.out.println("non_prime_" + (nonPrimeSum > 0 ? nonPrimeSum / nonPrimeCount : "undefined"));
    }
}
