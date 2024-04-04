import java.util.Scanner;

public class Practice1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        char temp = str.charAt(n);
        temp = Character.toLowerCase(temp);
        System.out.println(str.substring(0, n) + temp + temp + str.substring(n+1));
    }
}