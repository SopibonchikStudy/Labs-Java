import java.util.Scanner;

public class Demo4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int finish = scanner.nextInt();
        int n = 5;
        int sum = 0;
        for (int i = start; i <= finish; ++i) {
            int res = 1;
            for (int j = 1; j <= i; ++j) {
                res *= j;
            }
            if (i != n){
                sum += res;
            }else{
                System.out.println(res);
            }
        }

        System.out.println(sum);
    }
}
