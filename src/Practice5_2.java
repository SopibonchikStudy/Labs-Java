import java.util.Scanner;

public class Practice5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(multiplication(str));
    }

    static long multiplication(String text) {
        int temp = text.indexOf(" ");
        long res = 1;
        if (temp == -1) {
            try {
                res = Integer.parseInt(text);
            } catch (NumberFormatException e) {
            }
            return res;
        }
        try {
            res *= Integer.parseInt(text.substring(0, temp)) * multiplication(text.substring(temp + 1));
        } catch (NumberFormatException e) {
            res *= multiplication(text.substring(temp + 1));
        }
        return res;
    }
}
