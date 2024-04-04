import java.util.Scanner;

public class Practice6_1 {
    public static void main(String[] args) {
        //Циклическое вращение элементов влево на значение суммы
        int[] arr = input();
        int[] res = new int[arr.length];
        int sum = 0;
        for (int el : arr) {
            sum += el;
        }
        sum = sum % arr.length;
        for (int i = 0; i < arr.length; ++i) {
            if (i - sum < 0) {
                res[arr.length - sum + i] = arr[i];
            } else {
                res[i - sum] = arr[i];
            }
        }
        for (int i = 0; i < res.length; ++i) {
            System.out.print(res[i]);
            if (i != res.length - 1) System.out.print(" ");
        }

    }

    static int[] input() {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int[] res = new int[str.length];
        try {
            for (int i = 0; i < str.length; ++i) {
                res[i] = Integer.parseInt(str[i]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please, try again");
            res = input();
        }
        return res;
    }
}
