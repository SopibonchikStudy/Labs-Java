import java.util.Scanner;

public class Demo4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();
        int sum = 0;
        int n = 5;
        for (int i = start; i <= finish;++i){
            if( i != n && i % 3 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
