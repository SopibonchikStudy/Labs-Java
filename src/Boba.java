import java.util.Scanner;
public class Boba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < Math.pow(2,16)+10; ++i) {
            System.out.printf("Iteration №%d\n", i + 1);
            System.out.println((char)(i+1));

        }

    }
}