import java.util.Scanner;

public class Practice2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine().toLowerCase();
        String month = scanner.nextLine().toLowerCase();
        double amount = Double.parseDouble(scanner.nextLine());
        int n = 5;
        double res = 0;
        res = switch (fruit.toLowerCase()) {
            case "apple" -> 9.99 * n * amount;
            case "plum" -> 10.98 * n * amount;
            case "banana" -> 11.49 * n * amount;
            case "grapes" -> 15.99 * n * amount;
            case "orange" -> 17.99 * n * amount;
            case "kiwi" -> 37.99 * n * amount;
            case "mango" -> 39.99 * n * amount;
            default -> -1.0;
        };
        switch (month.toLowerCase()) {
            case "june", "july", "august","march", "april", "may", "september", "october", "november":
                break;
            case "january", "february", "december": {
                if (fruit.equals("orange") || fruit.equals("kiwi")) {
                    res *= 1.07;
                }
                break;
            }
            default: {
                res = -1;
                break;
            }

        }
        if (res < 0) {
            System.out.println("INVALID");
        } else {
            System.out.printf("%.2f", Math.ceil(res*100)/100.0 );
        }
    }
}
